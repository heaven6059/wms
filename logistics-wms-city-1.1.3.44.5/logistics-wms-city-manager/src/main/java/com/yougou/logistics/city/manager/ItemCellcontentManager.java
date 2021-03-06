package com.yougou.logistics.city.manager;

import java.util.Map;

import com.yougou.logistics.base.common.exception.ManagerException;
import com.yougou.logistics.base.common.model.AuthorityParams;
import com.yougou.logistics.base.manager.BaseCrudManager;
import com.yougou.logistics.city.common.utils.SumUtilMap;

public interface ItemCellcontentManager extends BaseCrudManager {
	public SumUtilMap<String, Object> findSumQty(Map<String, Object> map,String[] areaNos,AuthorityParams authorityParams) throws ManagerException;
}