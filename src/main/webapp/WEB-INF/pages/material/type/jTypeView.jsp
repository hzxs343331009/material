<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>查看类型</title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	
	<li id="new"><a href="#" onclick="window.history.back()">返回</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    查看类型
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
		<tr>
		
			<td>类型名称：</td>
			<td>${type.typeName} </td>
		</tr>
		<tr>
			<td>类型状态：</td>
			<td><c:if test="${type.state==1}">启用</c:if>
			<c:if test="${type.state==0}">停用</c:if> </td>
		</tr>
</table>
<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">编号</td>
		<td class="tableHeader">型号</td>
		<td class="tableHeader">价格</td>
		<td class="tableHeader">改动日期</td>
		<td class="tableHeader">状态</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${modelList}" var="mo" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		
		<td>${status.index+1}</td>
		<td>${mo.modelId}</td>
		<td><a href="/material/model/toview?modelId=${mo.modelId}">${mo.modelStr}</a></td>
		<td>${mo.price}</td>
		<td><fmt:formatDate value="${mo.pDate}" pattern="yyyy-MM-dd" /></td>
		<td>
			<c:if test="${mo.state==1}"><a href="/material/model/stop?modelId=${mo.modelId}&typeId=${mo.parentType.typeId}"><font color="green">启用</font></a></c:if>
			<c:if test="${mo.state==0}"><a href="/material/model/start?modelId=${mo.modelId}&typeId=${mo.parentType.typeId}"><font color="red">停用</font></a></c:if>
		</td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

