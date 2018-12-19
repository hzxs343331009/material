<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>新增公司</title>
	<script type="text/javascript" src="${ctx}/staticfile/js/jquery-1.6.2.js"></script>
	<script language=javascript>
        function companyNameShow(obj){
        	if (obj.value=="other"){
        		document.getElementById("companyName").type="text";
                document.getElementById("simpleName").value="";
                document.getElementById("dutyNo").value="";
                document.getElementById("simpleName").readOnly="false";
                document.getElementById("dutyNo").readOnly="false";
        	}else{
        		document.getElementById("companyName").type="hidden";
        		var companyId = obj.value;
        		$.ajax({
        	          url: "http://localhost:8090/material/company/ajaxgetcompany",
        	          type: "POST",
        	          dataType: "json",
        	          data: {'companyId':companyId},
        	          async: false,
        	          success: function(data) {
        	            $.each(data, function(index, element) {
        	                document.getElementById("simpleName").value=data.simpleName;
        	                document.getElementById("dutyNo").value=data.dutyNo;
        	                document.getElementById("simpleName").readOnly="true";
        	                document.getElementById("dutyNo").readOnly="true";
        	            });
        	          },
        	          error: function() {
        	            alert("error");
        	          }
        	        });
        		
        		
        	}
        }
	</script>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	
	<li id="new"><a href="#" onclick="window.history.back()">返回</a></li>
	<li id="new"><a href="#" onclick="formSubmit('save','_self');this.blur();">保存</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    新增公司
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
		<tr>
			<td width="10%" height="40px">公司名称：</td>
			<td width="20%">
				<select name="companyId" onchange="companyNameShow(this)">
				<option value="other">--其他--</option>
				
				<c:forEach items="${companyList}" var="company">
					<option value="${company.companyId}">${company.simpleName}</option>
				</c:forEach>
				</select>
				<input type="text" name="companyName" id="companyName"/>
			</td>
		</tr>
		<tr>
			<td>公司简称：</td>
			<td>
				<input type="text" name="simpleName" id="simpleName" value=""/>
			</td>
		</tr>
		<tr>
			<td>公司税号：</td>
			<td><input type="text" name="dutyNo" id="dutyNo" value=""/> </td>
		</tr>
		<tr>
			<td>使用方地址：</td>
			<td><input type="text" name="userCompany" /> </td>
		</tr>
		<tr>
			<td>型号状态：</td>
			<td><input type="radio" name="state" value="1" checked="checked" >启用
			<input type="radio" name="state" value="0" >停用 </td>
		</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

