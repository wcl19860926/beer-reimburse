package com.crc.ems.beer.voucher.base.ibaties;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.UpdateProvider;
import tk.mybatis.mapper.annotation.RegisterMapper;

import java.util.List;

/**
 * @Ccompany: crc.com.hk
 * @Auther: chenzhongqiang
 * @Date: 2019/1/13 15:10
 * @Description:
 */
@RegisterMapper
public interface InsertOrUpdateListMapper<T> {

    /**
     * 批量插入，支持批量插入和更新的数据库可以使用，例如MySQL,H2等
     * <p>
     * 不支持主键策略，插入前需要设置好主键的值
     * <p>
     * 特别注意：2018-04-22 后，该方法支持 @KeySql 注解的 genId 方式 insert into ... on duplicate key update ...
     * 注意：因为JDBC驱动原因，批量插入时候，List<EntityDto> 只返回第一条EntityDto.ID，ID必须自增ID
     * 如果插入List<EntityDto>需要返回所有EntityDto.ID，请调用insertList方法
     *
     * @param recordList
     * @return
     */
    @Options(useGeneratedKeys = true)
    @InsertProvider(type = InsertOrUpdateListProvider.class, method = "dynamicSQL")
    int insertOrUpdateList(List<? extends T> recordList);

    /**
     * 通过主键批量更新不为null的字段 spring.datasource.url需要增加参数：&allowMultiQueries=true
     * 
     * @param recordList
     * @return
     */
    @UpdateProvider(type = InsertOrUpdateListProvider.class, method = "dynamicSQL")
    int updateListByPrimaryKeySelective(List<? extends T> recordList);

    /**
     * 通过主键批量更新全部字段 spring.datasource.url需要增加参数：&allowMultiQueries=true
     * 
     * @param recordList
     * @return
     */
    @UpdateProvider(type = InsertOrUpdateListProvider.class, method = "dynamicSQL")
    int updateListByPrimaryKey(List<? extends T> recordList);

}
