<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>查看型号</title>
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
    查看型号
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
		<tr>
			<td>型号名称：</td>
			<td>${modelPojo.modelStr}</td>
			<td>类型：</td>
			<td>${modelPojo.parentType.typeName}</td>
			<td>库存数量：</td>
			<td>${modelPojo.amount}</td>
		</tr>
		<tr>
			<td>单位：</td>
			<td>${modelPojo.unit}</td>
			<td>价格：</td>
			<td>${modelPojo.price}元</td>
			<td>公司：</td>
			<td>${modelPojo.company.companyId}</td>
		</tr>
		<tr>
			<td>型号状态：</td>
			<td><c:if test="${modelPojo.state==1}">启用</c:if>
			<c:if test="${modelPojo.state==0}">停用</c:if></td>
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
		<td class="tableHeader">公司</td>
		<td class="tableHeader">状态</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${priceLogs}" var="price" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		
		<td>${status.index+1}</td>
		<td>${price.priceId}</td>
		<td><a href="/material/model/toview?modelId=${modelPojo.modelId}">${modelPojo.modelStr}</a></td>
		<td>${price.price}</td>
		<td><fmt:formatDate value="${price.createDate}" pattern="yyyy-MM-dd" /></td>
		<td>${price.company.simpleName}</td>
		<td>
			<c:if test="${price.state==1}"><a href="/material/price/stop?priceId=${price.priceId}&modelId=${price.model.modelId}"><font color="green">启用</font></a></c:if>
			<c:if test="${price.state==0}"><a href="/material/price/start?priceId=${price.priceId}&modelId=${price.model.modelId}"><font color="red">停用</font></a></c:if>
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

