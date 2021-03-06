package com.yougou.logistics.city.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yougou.logistics.base.common.exception.ManagerException;
import com.yougou.logistics.base.common.exception.ServiceException;
import com.yougou.logistics.base.common.utils.SimplePage;
import com.yougou.logistics.base.manager.BaseCrudManagerImpl;
import com.yougou.logistics.base.service.BaseCrudService;
import com.yougou.logistics.city.common.dto.BillConQualityChangeDtlDto;
import com.yougou.logistics.city.common.dto.BillConQualityChangeDtlDto2;
import com.yougou.logistics.city.service.BillConQualityChangeDtlService;

/*
 * 请写出类的用途 
 * @author luo.hl
 * @date  Thu Oct 24 13:54:46 CST 2013
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
@Service("billConQualityChangeDtlManager")
class BillConQualityChangeDtlManagerImpl extends BaseCrudManagerImpl implements BillConQualityChangeDtlManager {
	@Resource
	private BillConQualityChangeDtlService billConQualityChangeDtlService;

	@Override
	public BaseCrudService init() {
		return billConQualityChangeDtlService;
	}

	@Override
	public int findDetailCount(BillConQualityChangeDtlDto dto) throws ManagerException {
		try {
			return billConQualityChangeDtlService.findDetailCount(dto);
		} catch (ServiceException e) {
			throw new ManagerException(e);
		}
	}

	@Override
	public List<BillConQualityChangeDtlDto> findDetail(SimplePage page, BillConQualityChangeDtlDto dto)
			throws ManagerException {
		try {
			return billConQualityChangeDtlService.findDetail(page, dto);
		} catch (ServiceException e) {
			throw new ManagerException(e);
		}
	}

	@Override
	public List<BillConQualityChangeDtlDto2> findItemDetail(BillConQualityChangeDtlDto dto) throws ManagerException {
		try {
			return billConQualityChangeDtlService.findItemDetail(dto);
		} catch (ServiceException e) {
			throw new ManagerException(e);
		}
	}

}