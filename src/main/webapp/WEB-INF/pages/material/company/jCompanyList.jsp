<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>公司列表</title>
	<script type="text/javascript" src="${ctx}/staticfile/js/jquery-1.6.2.js"></script>
	<script type="text/javascript">
		$(function(){
			$(".del").click(function(){
				var dels = $("input[name='companyId']:checked")
				var names = "";
				for (var i = 0; i < dels.length; i++) {
					var delname = $(dels.get(i)).next("input[name='name']");
					names += delname.val() + "\r\n";
				}
				if (names != "") {
					names = names.substring(0, names.length-2);
				}
				if(names != "" && confirm("确认删除一下公司吗:\r\n" + names + "\r\n建议将公司做停用处理！！！")){
					formSubmit('delete','_self');this.blur();
				}else{
					$("input[name='companyId']:checked").attr("checked",false);
					$("input[name='selid']:checked").attr("checked",false);
				}
			});
		})
	</script>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="view"><a href="#" onclick="formSubmit('toview','_self');this.blur();">查看</a></li>
	<li id="new"><a href="#" onclick="formSubmit('tocreate','_self');this.blur();">新增</a></li>
	<li id="update"><a href="#" onclick="formSubmit('toupdate','_self');this.blur();">修改</a></li>
	<li id="delete"><a href="#" class="del">删除</a></li>
	<li id="new"><a href="#" onclick="formSubmit('start','_self');this.blur();">启用</a></li>
	<li id="new"><a href="#" onclick="formSubmit('stop','_self');this.blur();">停用</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    公司列表
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr>
		<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('roleId',this)"></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">公司ID</td>
		<td class="tableHeader">公司名称</td>
		<td class="tableHeader">公司简称</td>
		<td class="tableHeader">使用方地址</td>
		<td class="tableHeader">状态</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${companyList}" var="c" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		<td>
			<input type="checkbox" name="companyId" value="${c.companyId}"/>
			<input type="hidden" name="name" value="${c.simpleName}"/>
		</td>
		<td>${status.index+1}</td>
		<td>${c.companyId}</td>
		<td>${c.companyName}</td>
		<td>${c.simpleName}</td>
		<td>${c.userCompany}</td>
		<td>
			<c:if test="${c.state==1}"><a href="stop?companyId=${c.companyId}"><font color="green">启用</font></a></c:if>
			<c:if test="${c.state==0}"><a href="start?companyId=${c.companyId}"><font color="red">停用</font></a></c:if>
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

