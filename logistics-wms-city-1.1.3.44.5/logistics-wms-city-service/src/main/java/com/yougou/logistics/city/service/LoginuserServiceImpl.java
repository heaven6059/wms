package com.yougou.logistics.city.service;

import java.util.List;

import com.yougou.logistics.base.common.exception.ServiceException;
import com.yougou.logistics.base.dal.database.BaseCrudMapper;
import com.yougou.logistics.base.service.BaseCrudServiceImpl;
import com.yougou.logistics.city.common.model.Loginuser;
import com.yougou.logistics.city.dal.database.LoginuserMapper;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/*
 * 请写出类的用途 
 * @author luo.hl
 * @date  Mon Sep 23 10:01:03 CST 2013
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
@Service("loginuserService")
class LoginuserServiceImpl extends BaseCrudServiceImpl implements LoginuserService {
    @Resource
    private LoginuserMapper loginuserMapper;

    @Override
    public BaseCrudMapper init() {
        return loginuserMapper;
    }

	@Override
	public List<Loginuser> getUserListByRoleId(Integer roleId)
			throws ServiceException {
		try{
			return loginuserMapper.getUserListByRoleId(roleId);
		}catch(Exception e){
			throw new ServiceException(e);
		}
	}
}