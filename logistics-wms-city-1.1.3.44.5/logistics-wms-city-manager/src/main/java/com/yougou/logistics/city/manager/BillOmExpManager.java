package com.yougou.logistics.city.manager;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.yougou.logistics.base.common.exception.ManagerException;
import com.yougou.logistics.base.common.exception.ServiceException;
import com.yougou.logistics.base.common.model.AuthorityParams;
import com.yougou.logistics.base.common.utils.SimplePage;
import com.yougou.logistics.base.manager.BaseCrudManager;
import com.yougou.logistics.city.common.model.BillOmExp;

/**
 * 出库订单
 * @author zuo.sw
 * @date  2013-09-29 16:50:42
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
public interface BillOmExpManager extends BaseCrudManager {
	
	/**
	 * 删除出库订单
	 * @param locnoStrs
	 * @return
	 * @throws ManagerException
	 */
	public boolean deleteBillOmExp(String noStrs) throws ManagerException;
	
	/**
	 * 新增出库订单
	 * @param billOmExp
	 * @return
	 * @throws ManagerException
	 */
	public Map<String,Object> addBillOmExp(BillOmExp billOmExp)throws ManagerException;
	
	
	/**
	 * 出库调度总页数
	 * @param billOmLocate
	 * @param authorityParams
	 * @return
	 * @throws ManagerException
	 */
	public int findBillOmExpDispatchCount(@Param("params") BillOmExp billOmExp,
			@Param("authorityParams") AuthorityParams authorityParams) throws ManagerException;

	/**
	 * 出库调度信息列表
	 * @param page
	 * @param orderByField
	 * @param orderBy
	 * @param billOmExp
	 * @param authorityParams
	 * @return
	 * @throws ManagerException
	 */
	public List<BillOmExp> findBillOmExpDispatchByPage(@Param("page") SimplePage page,
			@Param("orderByField") String orderByField, @Param("orderBy") String orderBy,
			@Param("params") BillOmExp billOmExp, @Param("authorityParams") AuthorityParams authorityParams)
			throws ManagerException;
	
	/**
	 * 出库调度调用存储过程
	 * @param billOmExp
	 * @throws ManagerException
	 */
	public Map<String, Object> procBillOmExpDispatchQuery(BillOmExp billOmExp) throws ManagerException;
	
	/**
	 * 出库调度试图汇总数据
	 * @param billOmExp
	 * @return
	 */
	public BillOmExp findBillOmExpViewTotalQty(BillOmExp billOmExp) throws ManagerException;
	
	public int findCountExp(BillOmExp params, AuthorityParams authorityParams)throws ManagerException;
	public List<BillOmExp> findByPageExp(SimplePage page,String orderByField,String orderBy,BillOmExp params, AuthorityParams authorityParams)throws ManagerException;
	
	public int findCountExpForPre(BillOmExp params, AuthorityParams authorityParams)throws ManagerException;
	
	public List<BillOmExp> findByPageExpForPre(SimplePage page,String orderByField,String orderBy,BillOmExp params, AuthorityParams authorityParams)throws ManagerException;
	
	/**
	 * 手工关闭发货通知单
	 * @param billOmExp
	 * @throws ServiceException
	 */
	public void overExpBill(BillOmExp billOmExp) throws ManagerException;
	
	/**
	 * 转存储发货
	 * @param billOmExp
	 * @throws ServiceException
	 */
	public void toClass0ForExp(BillOmExp billOmExp) throws ManagerException;
	/**
	 * 转分货发货
	 * @param billOmExp
	 * @throws ServiceException
	 */
	public void toClass1ForExp(BillOmExp billOmExp) throws ManagerException;
	
	public Map<String, Object> findSumQty(Map<String, Object> params,AuthorityParams authorityParams);
}