<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>新增部门</title>
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
    新增用户
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="username" /> </td>
			<td>密码：</td>
			<td><input type="password" name="password" /> </td>
		</tr>
		<tr>
			<td>手机号：</td>
			<td><input type="text" name="userInfo.telephone" /> </td>
			<td>身份证号：</td>
			<td><input type="text" name="userInfo.cardNo" /> </td>
		</tr>
		<tr>
			<td>真实姓名：</td>
			<td><input type="text" name="userInfo.name" /> </td>
			<td>薪水：</td>
			<td><input type="text" name="userInfo.salary" /> </td>
		</tr>
		
		<tr>
			<td>所属部门：</td>
			<td><select name="dept.deptId">
				<option>-无部门-</option>
				<c:forEach items="${depts}" var="dept">
					<option value="${dept.deptId }">${dept.deptName}</option>
				</c:forEach>
			</select> </td>
			<td>上级领导：</td>
			<td><select name="userInfo.managerUserInfo.userInfoId">
				<option>-无上级-</option>
				<c:forEach items="${users}" var="u">
					<option value="${u.userId }">${u.userInfo.name}</option>
				</c:forEach>
			</select> </td>
		</tr>
		<tr>
			<td>岗位描述：</td>
			<td><input type="text" name="userInfo.station" /></td>
			<td>用户级别：</td>
			<td><select name="userInfo.userLevel">
				<option value="4">-普通用户-</option>
				<option value="3">-部门经理-</option>
				<option value="2">-副总-</option>
				<option value="1">-总经理-</option>
				<option value="0">-超级管理员-</option>
			</select> </td>
		</tr>
		<tr><td>入职日期：</td> <td><input type="date" name="userInfo.joinDate" /> </td>
			<td>生日：</td> <td><input type="date" name="userInfo.birthday" /> </td>
		 </tr>
		<tr>
		
		<td>性别：</td>
			<td><input type="radio" name="userInfo.gender" value="男" checked="checked" >男
			<input type="radio" name="userInfo.gender" value="女" >女 </td>
			<td>用户状态：</td>
			<td><input type="radio" name="state" value="1" checked="checked" >启用
			<input type="radio" name="state" value="0" >停用 </td>
		</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

