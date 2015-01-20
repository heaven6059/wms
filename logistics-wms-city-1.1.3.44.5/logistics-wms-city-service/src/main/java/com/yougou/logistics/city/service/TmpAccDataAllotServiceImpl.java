package com.yougou.logistics.city.service;

import com.yougou.logistics.base.dal.database.BaseCrudMapper;
import com.yougou.logistics.base.service.BaseCrudServiceImpl;
import com.yougou.logistics.city.dal.database.TmpAccDataAllotMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/*
 * 请写出类的用途 
 * @author su.yq
 * @date  Sat Jan 18 21:28:08 CST 2014
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
@Service("tmpAccDataAllotService")
class TmpAccDataAllotServiceImpl extends BaseCrudServiceImpl implements TmpAccDataAllotService {
    @Resource
    private TmpAccDataAllotMapper tmpAccDataAllotMapper;

    @Override
    public BaseCrudMapper init() {
        return tmpAccDataAllotMapper;
    }
}