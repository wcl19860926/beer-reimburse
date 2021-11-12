package com.crc.ems.beer.voucher.base.ibaties;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.util.Set;

/**
 * @Ccompany: crc.com.hk
 * @Auther: chenzhongqiang
 * @Date: 2019/1/13 14:45
 * @Description:
 */
public class InsertOrUpdateListProvider extends MapperTemplate {

    public InsertOrUpdateListProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    /**
     * MySQL批量保存或更新信息。ID不存在，插入；ID存在则更新 insert into ... on duplicate key update ... 注意：因为JDBC驱动原因，批量插入时候，List<EntityDto>
     * 只返回第一条EntityDto.ID，ID必须自增ID 如果插入List<EntityDto>需要返回所有EntityDto.ID，请调用insertList方法
     * 
     * @param ms
     * @return
     */
    public String insertOrUpdateList(MappedStatement ms) {

        final Class<?> entityClass = getEntityClass(ms);

        StringBuilder sql = new StringBuilder();
        sql.append(
            "<bind name=\"listNotEmptyCheck\" value=\"@tk.mybatis.mapper.util.OGNL@notEmptyCollectionCheck(list, '"
                + ms.getId() + " 方法参数为空')\"/>");
        sql.append(SqlHelper.insertIntoTable(entityClass, tableName(entityClass), "list[0]"));
        sql.append(SqlHelper.insertColumns(entityClass, false, false, false));
        sql.append(" VALUES ");
        sql.append("<foreach collection=\"list\" item=\"record\" separator=\",\" >");
        sql.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
        Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
        // 当某个列有主键策略时，不需要考虑他的属性是否为空，因为如果为空，一定会根据主键策略给他生成一个值
        for (EntityColumn column : columnList) {
            if (column.isInsertable()) {
                sql.append(column.getColumnHolder("record") + ",");
            }
        }
        sql.append("</trim>");
        sql.append("</foreach>");
        sql.append(" on duplicate key update ");
        for (EntityColumn column : columnList) {
            // 更新时候不更新CREATED_BY和CREATED_TIME
            if (!column.isId() && !"`CREATED_BY`".equals(column.getColumn())
                && !"`CREATED_TIME`".equals(column.getColumn())) {
                sql.append(column.getColumn()).append("= VALUES(").append(column.getColumn()).append(") ").append(",");
            }
        }

        String sqlStr = sql.toString();
        sqlStr = sqlStr.substring(0, sqlStr.lastIndexOf(","));
        EntityHelper.setKeyProperties(EntityHelper.getPKColumns(entityClass), ms);

        return sqlStr;
    }

    /**
     * 通过主键更新不为null的字段
     *
     * @param ms
     */
    public String updateListByPrimaryKeySelective(MappedStatement ms) {
        Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(
            "<foreach collection=\"list\" item=\"record\" index=\"index\" open=\"\" close=\"\" separator=\";\"> ");
        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
        sql.append(SqlHelper.updateSetColumns(entityClass, "record", true, isNotEmpty()));
        sql.append(SqlHelper.wherePKColumns(entityClass, "record", true));
        sql.append("</foreach>");
        return sql.toString();
    }

    /**
     * 通过主键更新全部字段
     *
     * @param ms
     */
    public String updateListByPrimaryKey(MappedStatement ms) {
        Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(
            "<foreach collection=\"list\" item=\"record\" index=\"index\" open=\"\" close=\"\" separator=\";\"> ");
        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
        sql.append(SqlHelper.updateSetColumns(entityClass, "record", false, false));
        sql.append(SqlHelper.wherePKColumns(entityClass, "record", true));
        sql.append("</foreach>");
        return sql.toString();
    }

}
