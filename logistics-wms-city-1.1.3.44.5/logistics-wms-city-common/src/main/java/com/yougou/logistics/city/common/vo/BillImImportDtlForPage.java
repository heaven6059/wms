package com.yougou.logistics.city.common.vo;

/**
 * 请写出类的用途 
 * @author zuo.sw
 * @date  2013-09-25 10:24:56
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
public class BillImImportDtlForPage {
	
    private String locno;

    private String ownerNo;

    private String importNo;
    
	private long startRowNum;
	
	private long endRowNum;

    public String getLocno() {
        return locno;
    }

    public void setLocno(String locno) {
        this.locno = locno;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getImportNo() {
        return importNo;
    }

    public void setImportNo(String importNo) {
        this.importNo = importNo;
    }

	public long getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(long startRowNum) {
		this.startRowNum = startRowNum;
	}

	public long getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(long endRowNum) {
		this.endRowNum = endRowNum;
	}
 
}