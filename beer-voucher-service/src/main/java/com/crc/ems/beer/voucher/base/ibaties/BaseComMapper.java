package com.crc.ems.beer.voucher.base.ibaties;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的CommonMapper
 *
 * @author chenzhongqiang
 */
public interface BaseComMapper<T>
    extends Mapper<T>, MySqlMapper<T>, InsertOrUpdateListMapper<T>, ConditionMapper<T>, IdsMapper<T> {

}
