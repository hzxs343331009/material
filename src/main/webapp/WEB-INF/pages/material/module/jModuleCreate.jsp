<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>新增模块</title>
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
    新增模块
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
		<tr>
			<td>模块名称：</td>
			<td><input type="text" name="name" /> </td>
		</tr>
		<tr>
			<td>上级模块：</td>
			<td><select name="parentModule.moduleId">
				<option>--无上级--</option>
				
				<c:forEach items="${modules}" var="m">
					<option value="${m.moduleId }">${m.name}</option>
				</c:forEach>
			</select> </td>
		</tr>
		<tr>
			<td>模块类型：</td>
			<td><select name="ctype">
				<option value="1">主菜单</option>
				<option value="2">左侧菜单</option>
				<option value="3">按钮</option>
			</select> </td>
		</tr>
		<tr>
			<td>模块介绍：</td>
			<td><input type="text" name="remark" /> </td>
		</tr>
		<tr>
			<td>模块序号：</td>
			<td><input type="text" name="orderNo" /> </td>
		</tr>
		
		
		<tr>
			<td>模块状态：</td>
			<td><input type="radio" name="state" value="1" checked="checked" >启用
			<input type="radio" name="state" value="0" >停用 </td>
		</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

