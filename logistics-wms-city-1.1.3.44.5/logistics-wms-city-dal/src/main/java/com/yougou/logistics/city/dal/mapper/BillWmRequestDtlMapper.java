/*
 * 类名 com.yougou.logistics.city.dal.mapper.BillWmRequestDtlMapper
 * @author yougoupublic
 * @date  Fri Mar 21 17:59:52 CST 2014
 * @version 1.0.0
 * @copyright (C) 2013 YouGou Information Technology Co.,Ltd 
 * All Rights Reserved. 
 * 
 * The software for the YouGou technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 * 
 */
package com.yougou.logistics.city.dal.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yougou.logistics.base.common.exception.DaoException;
import com.yougou.logistics.base.common.model.AuthorityParams;
import com.yougou.logistics.base.dal.database.BaseCrudMapper;
import com.yougou.logistics.city.common.model.BillWmRequestDtl;
import com.yougou.logistics.city.common.utils.SumUtilMap;

public interface BillWmRequestDtlMapper extends BaseCrudMapper {
	public SumUtilMap selectSumQty(@Param("params") Map<String, Object> map,
			@Param("authorityParams") AuthorityParams authorityParams);

	/**
	 * 根据退厂计划转退厂申请生成明细
	 * @param params
	 * @return
	 */
	public int insertByWmPlan(@Param("params") Map<String, Object> params);

	/**
	 * 批量插入退厂申请单明细
	 * @param list
	 * @throws DaoException
	 */
	public void insertBatchWmPlan(List<BillWmRequestDtl> list) throws DaoException;

}