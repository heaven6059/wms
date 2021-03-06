package com.yougou.logistics.city.service;

import java.util.List;
import java.util.Map;

import com.yougou.logistics.base.common.exception.ServiceException;
import com.yougou.logistics.base.common.model.AuthorityParams;
import com.yougou.logistics.base.common.utils.SimplePage;
import com.yougou.logistics.base.service.BaseCrudService;
import com.yougou.logistics.city.common.dto.BillOmOutstockDtlDto;
import com.yougou.logistics.city.common.model.BillOmOutstockDirect;
import com.yougou.logistics.city.common.model.CmDefarea;
import com.yougou.logistics.city.common.utils.SumUtilMap;
import com.yougou.logistics.city.common.vo.BillOmOutstockDirectForQuery;

/**
 * 请写出类的用途 
 * @author zuo.sw
 * @date  2013-10-09 11:09:10
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
public interface BillOmOutstockDirectService extends BaseCrudService {
	
	
	/**
	 * 根据出库单类型查询波次号和批次列表
	 * @param authorityParams TODO
	 * @param expType
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryLocateNoByExpType(BillOmOutstockDirectForQuery vo, AuthorityParams authorityParams)throws ServiceException;
	
	/**
	 * 出库单类型,波次号，出库单号，订单号查询波次号和批次列表
	 * @param authorityParams TODO
	 * @param expType
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryLocateNoByMore(Map<String,Object> map, AuthorityParams authorityParams)throws ServiceException;
	
	/**
	 * 根据出库单类型，波次号，批次查询作业类型
	 * @param vo
	 * @param authorityParams TODO
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryOperateTypeByParam(BillOmOutstockDirectForQuery vo, AuthorityParams authorityParams)throws ServiceException;
	
	/**
	 * 根据出库单类型，波次号，批次，作业类型查询库区信息
	 * @param vo
	 * @param authorityParams TODO
	 * @param orderByField TODO
	 * @param orderBy TODO
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryAreaInfoByParam(BillOmOutstockDirectForQuery vo, AuthorityParams authorityParams, String orderByField, String orderBy)throws ServiceException;
	
	/**
	 * 根据出库单类型，波次号，批次，作业类型查询客户信息
	 * @param vo
	 * @param authorityParams TODO
	 * @param orderByField TODO
	 * @param orderBy TODO
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryStoreInfoByParam(BillOmOutstockDirectForQuery vo, AuthorityParams authorityParams, String orderByField, String orderBy)throws ServiceException;
	
	/**
	 * 根据出库单类型，波次号，批次,作业类型 ，客户   查询拣货的商品信息
	 * @param vo
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryOutstockDirectByStore(BillOmOutstockDirectForQuery vo)throws ServiceException;
	
	
	/**
	 * 根据出库单类型，波次号，批次,作业类型 ，库区  查询拣货的商品信息
	 * @param vo
	 * @return
	 * @throws ServiceException
	 */
	public List<BillOmOutstockDirect>  queryOutstockDirectByArea(BillOmOutstockDirectForQuery vo)throws ServiceException;
	
	/**
	 * 发单调用存储过程
	 * @param map
	 * @throws ServiceException
	 */
	public void procOmOutStockDirect(BillOmOutstockDirectForQuery vo) throws ServiceException;
	
	/**
	 * 移库发单调用存储过程
	 * @param map
	 * @throws ServiceException
	 */
	public void procOmPlanOutStockDirect(BillOmOutstockDirectForQuery vo) throws ServiceException;
	
	/**
	 * 查询移库发单分页总数
	 * @param authorityParams TODO
	 * @param untread
	 * @return
	 * @throws DaoException
	 */
	public int findOutstockDirectCount(BillOmOutstockDirect billOmOutstockDirect, AuthorityParams authorityParams)throws ServiceException;
	
	/**
	 * 查询移库发单分页
	 * @param page
	 * @param authorityParams TODO
	 * @param untread
	 * @return
	 * @throws DaoException
	 */
	public List<BillOmOutstockDirect> findOutstockDirectByPage(SimplePage page,BillOmOutstockDirect billOmOutstockDirect, AuthorityParams authorityParams)throws ServiceException;
	
	public SumUtilMap<String, Object> selectSumQty(BillOmOutstockDirect billOmOutstockDirect, AuthorityParams authorityParams) throws ServiceException;
	
	/**
	 * 移库发单储位列表界面只显示移库计划已审核未完结明细所在的库区分页汇总
	 * @param params
	 * @param authorityParams
	 * @return
	 */
	public int findHmPlanCmDefareaCount(Map<String,Object> params,AuthorityParams authorityParams) throws ServiceException;
	
	/**
	 * 移库发单储位列表界面只显示移库计划已审核未完结明细所在的库区分页
	 * @param page
	 * @param orderByField
	 * @param orderBy
	 * @param params
	 * @param authorityParams
	 * @return
	 */
	public List<CmDefarea> findHmPlanCmDefareaByPage(SimplePage page,String orderByField,String orderBy,Map<String,Object> params,AuthorityParams authorityParams) throws ServiceException;

	
	/**
     * 查询按客户波次分页总数
     * 
     * @param params
     * @param authorityParams
     * @return
     * @throws DaoException
     */
    public int findOutstockDirectByStoreCount(
    	BillOmOutstockDirectForQuery vo,
	    AuthorityParams authorityParams)
	    throws ServiceException;

    /**
     * 查询按客户波次明细分页
     * 
     * @param page
     * @param orderByField
     * @param orderBy
     * @param params
     * @param authorityParams
     * @return
     * @throws DaoException
     */
    public List<BillOmOutstockDirect> findOutstockDirectByStoreByPage(
	    SimplePage page,
	    String orderByField,
	    String orderBy,
	    BillOmOutstockDirectForQuery vo,
	    AuthorityParams authorityParams)
	    throws ServiceException;
    
    
    /**
     * 查询按客户波次明细合计
     * @param authorityParams TODO
     * @param map
     * @return
     * @throws DaoException
     */
    public SumUtilMap<String, Object> selectOutstockDirectByStoreSumQty(
    		BillOmOutstockDirectForQuery vo, AuthorityParams authorityParams) throws ServiceException;
    
    
    /**
     * 查询按库区波次分页总数
     * 
     * @param params
     * @param authorityParams
     * @return
     * @throws DaoException
     */
    public int findOutstockDirectByAreaCount(
    		BillOmOutstockDirectForQuery vo,
	    AuthorityParams authorityParams)
	    throws ServiceException;

    /**
     * 查询按库区波次明细分页
     * 
     * @param page
     * @param orderByField
     * @param orderBy
     * @param params
     * @param authorityParams
     * @return
     * @throws DaoException
     */
    public List<BillOmOutstockDirect> findOutstockDirectByAreaByPage(
	    SimplePage page,
	    String orderByField,
	    String orderBy,
	    BillOmOutstockDirectForQuery vo,
	    AuthorityParams authorityParams)
	    throws ServiceException;
    
    
    /**
     * 查询按库区波次明细合计
     * @param authorityParams TODO
     * @param map
     * @return
     * @throws DaoException
     */
    public SumUtilMap<String, Object> selectOutstockDirectByAreaSumQty(
    		BillOmOutstockDirectForQuery vo, AuthorityParams authorityParams) throws ServiceException;
}