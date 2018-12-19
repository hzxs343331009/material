<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>类型列表</title>
	<script type="text/javascript" src="${ctx}/staticfile/js/jquery-1.6.2.js"></script>
	<script type="text/javascript">
		$(function(){
			$(".del").click(function(){
				var dels = $("input[name='typeId']:checked")
				var names = "";
				for (var i = 0; i < dels.length; i++) {
					var delname = $(dels.get(i)).next("input[name='name']");
					names += delname.val() + "\r\n";
				}
				if (names != "") {
					names = names.substring(0, names.length-2);
				}
				if(names != "" && confirm("确认删除一下类型吗:\r\n" + names + "\r\n建议将类型做停用处理！！！")){
					formSubmit('delete','_self');this.blur();
				}else{
					$("input[name='typeId']:checked").attr("checked",false);
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
    类型列表
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr>
		<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('typeId',this)"></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">编号</td>
		<td class="tableHeader">名称</td>
		<td class="tableHeader">状态</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${typeList}" var="tp" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
		<td>
			<input type="checkbox" name="typeId" value="${tp.typeId}"/>
			<input type="hidden" name="name" value="${tp.typeName}"/>
		</td>
		<td>${status.index+1}</td>
		<td>${tp.typeId}</td>
		<td><a href="toview?typeId=${tp.typeId}">${tp.typeName}</a></td>
		<td>
			<c:if test="${tp.state==1}"><a href="stop?typeId=${tp.typeId}"><font color="green">启用</font></a></c:if>
			<c:if test="${tp.state==0}"><a href="start?typeId=${tp.typeId}"><font color="red">停用</font></a></c:if>
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

