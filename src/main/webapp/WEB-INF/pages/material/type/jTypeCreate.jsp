<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>新增类别</title>
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
    新增类别
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
		<tr>
			<td>类别名称：</td>
			<td><input type="text" name="typeName" /> </td>
		</tr>
		<tr>
			<td>类别状态：</td>
			<td><input type="radio" name="state" value="1" checked="checked" >启用
			<input type="radio" name="state" value="0" >停用 </td>
		</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

