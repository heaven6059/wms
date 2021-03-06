<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta name="Keywords" content="百丽物流总部管理平台" />
<meta name="Description" content="百丽物流总部管理平台" />
<title>百丽物流总部管理平台V${(Session["sysVersion"])!}</title>
<#include  "/WEB-INF/ftl/common/header.ftl" >
<script src="${domainStatic}/resources/common/other-lib/index.js?version=${resourceVersion}"></script>
<script>
	$(document).ready(function() {
		$('#userLoc').window({ 
		title:'请选择仓库',
		collapsible:false,
		minimizable:false,
		maximizable:false,
		closable:false,
        width:315,  
        height:200,  
        modal:true  
    	});
    	
    	$.ajax({
    		async : true,
			cache : false,
			type : 'GET',
			dataType : "json",
			url:BasePath+'/user_organization/findUserOrganization',
    		success:function(data){
    		$("#userLocSelect").combobox({
				    data:data.list,
				    valueField:'organizationNo',    
				    textField:'valueAndText',
				    panelHeight:"auto",
				    loadFilter:function(data){
		    			if(data){
				       		 for(var i = 0;i<data.length;i++){
				       			 var tempData = data[i];
				       			 tempData.valueAndText =tempData.organizationNo+"→"+tempData.storeName;
				       		 }
		       	 		}
	    				return data;
	   			 },
				    onSelect:function(data){
			    		setLoc(data.organizationNo,data.storeName);
			    	}
				})
    		}
    	});
    	
    	  
	});
	
function setLoc(locNo,locName){
	$.ajax({
			cache : false,
			type : 'POST',
			dataType : "json",
			data:{
				locName:locName,
				locNo:locNo
			},
			url:BasePath+'/setLoc',
			success:function(){
				$("#locNameId").text(locName);
				$("#locNoId").text('('+locNo+')');
				$("#userLoc").window('close');
			}
	});
	
}	
	
</script>
</head>
<body class="easyui-layout">
<div id="loading"><p>加载中，请稍后...</p></div>
<div id="header" data-options="region:'north'">
    <div class="header_nav">
        <a class="logo" style="width:900px;" href="">标志</a>
        <div class="bd">
        	<span style="color:red;font-size:18px">${env}</span>
            <span class="wel">您好！
            	<input type="hidden" name="loginName" id="loginName" value=${(Session["session_user"].loginName)!}>
            	<input type="hidden" name="locType" id="locType" value=2>
            	${(Session["session_user"].username)!}&nbsp;&nbsp;
            	<span id="locNameId"></span>
            	<span id="locNoId"></span>
            </span> 
            <span class="mr5"><a id="lnkDesk" href="javascript:;">系统桌面</a> |<a target="_top" href="${ucIndexUrl!"#"}" class="c-white">返回用户中心</a>| <a target="_top" href="<@s.url "/uc_logout"/>">[退出]</a>
            </span>
        </div>
        <!--<div style="width:100%;float:right;padding-right:2px;">
        	<span  style="float:right; margin-right: 10px;">
        	<span style="color:red;font-size:14px">${env}</span>版本号：V${(Session["sysVersion"])!}</span>
        </div>-->
    </div>
</div>
<div id="left" data-options="region:'west',split:true,title:'目录导航',iconCls:'text-list-bullets',minWidth:180,maxWidth:180,minSplit:true">
    <div class="easyui-accordion" id="leftMenu" data-options="split:true,border:false,fit: true, animate: false"  style="border:none;" >
    </div>
</div>
<div id="main" data-options="region:'center'">
    <div id="mainTabs" class="easyui-tabs" data-options="fit:true,border:false" tools="#tab-tools">
        <div title="系统桌面"  data-options="icon:'icon-home'">
            <div class="pd10">
               		<img src="${domainStatic}/resources/assets/images/welcome.jpg?version=${resourceVersion}" />
            </div>
            <div id="userLoc">
            	<input class="easyui-combobox" style="width:300px" id="userLocSelect"/>
            </div>
        </div>
    </div>
</div>
<div id="tab-tools" style="display:none;border-left:none;border-top:none;">
    <a href="javascript:void(0)" class="easyui-linkbutton" plain="true" id="tabToolsFullScreen" iconCls="icon-window-max">全屏</a>
</div>
</body>
</html>
