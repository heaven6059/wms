/*
 * 类名 com.yougou.logistics.city.common.model.ConContent
 * @author su.yq
 * @date  Mon Oct 21 14:46:27 CST 2013
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
package com.yougou.logistics.city.common.model;

import java.math.BigDecimal;
import java.util.Date;

public class ConContent extends ConContentKey {
    private String ownerNo;

    private String containerNo;

    private String itemNo;

    //private Long itemId;

    private BigDecimal packQty;

    private BigDecimal qty;

    private BigDecimal outstockQty;

    private BigDecimal instockQty;

    private BigDecimal unusualQty;

    private String status;

    private String flag;

    private String instockType;

    private String hmManualFlag;

    private String creator;

    private Date createtm;

    private String editor;

    private Date edittm;

    private String labelNo;

    private String stockType;

    private String stockValue;

    private String taskNo;
    
    private String barcode;
    
    private String itemType;
    
    private String quality;
    
    private String supplierNo;
    

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

//    public Long getItemId() {
//        return itemId;
//    }
//
//    public void setItemId(Long itemId) {
//        this.itemId = itemId;
//    }

    public BigDecimal getPackQty() {
        return packQty;
    }

    public void setPackQty(BigDecimal packQty) {
        this.packQty = packQty;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getOutstockQty() {
        return outstockQty;
    }

    public void setOutstockQty(BigDecimal outstockQty) {
        this.outstockQty = outstockQty;
    }

    public BigDecimal getInstockQty() {
        return instockQty;
    }

    public void setInstockQty(BigDecimal instockQty) {
        this.instockQty = instockQty;
    }

    public BigDecimal getUnusualQty() {
        return unusualQty;
    }

    public void setUnusualQty(BigDecimal unusualQty) {
        this.unusualQty = unusualQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getInstockType() {
        return instockType;
    }

    public void setInstockType(String instockType) {
        this.instockType = instockType;
    }

    public String getHmManualFlag() {
        return hmManualFlag;
    }

    public void setHmManualFlag(String hmManualFlag) {
        this.hmManualFlag = hmManualFlag;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetm() {
        return createtm;
    }

    public void setCreatetm(Date createtm) {
        this.createtm = createtm;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getEdittm() {
        return edittm;
    }

    public void setEdittm(Date edittm) {
        this.edittm = edittm;
    }

    public String getLabelNo() {
        return labelNo;
    }

    public void setLabelNo(String labelNo) {
        this.labelNo = labelNo;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getStockValue() {
        return stockValue;
    }

    public void setStockValue(String stockValue) {
        this.stockValue = stockValue;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getSupplierNo() {
		return supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}
}