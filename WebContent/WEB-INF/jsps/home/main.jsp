<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Main</title>
<link type="text/css"
	href="${global_css_url}jquery/themes/base/ui.all.css" rel="stylesheet" />
<link type="text/css"
	href="${global_css_url}jquery/jquery.datetimepicker.css"
	rel="stylesheet" />
<script type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>
<script type="text/javascript"
	src="${global_js_url}jquery/jquery.dialog.all.js"></script>
<script type="text/javascript"
	src="${global_js_url}jquery/jquery.form.js"></script>
<script src="${global_js_url}jquery/ui/ui.core.js"
	type="text/javascript"></script>
<script src="${global_js_url}jquery/ui/ui.draggable.js"
	type="text/javascript"></script>
<script src="${global_js_url}jquery/ui/ui.resizable.js"
	type="text/javascript"></script>
<script src="${global_js_url}jquery/jquery.datetimepicker.js"
	type="text/javascript"></script>
<script type="text/javascript" src="${global_js_url}plan/home/main.js"></script>
<style type="text/css">
.typeRadio {
	background-color: red;
}
</style>
</head>

<body>
	<table>
		<s:iterator value="planList" var="plan">
			<tr>
				<th>${plan.planTypeEntity.name }</th>
				<td>${plan.studyContent }</td>
			</tr>
		</s:iterator>
	</table>

	<form action="plan!saveNewPlan.action" method="post">
		<table>
			<tr>
				<th>计划名称</th>
				<td><input name="planDto.content" /></td>
			</tr>
			<tr>
				<th>计划类型</th>
				<td><input type="radio" name="planDto.planType"
					class="typeRadio"> <input type="radio"
					name="planDto.planType" class="typeRadio"> <input
					type="radio" name="planDto.planType" class="typeRadio"> <input
					type="radio" name="planDto.planType" class="typeRadio">
			</tr>
			<tr>
				<th>开始时间</th>
				<td><input name="planDto.dateFrom" id="datetimepicker"
					class="ui-datepicker" type="text" /></td>
			</tr>
			<tr>
				<th>结束时间</th>
				<td><input name="planDto.dateTo" id="toDate"
					class="ui-datepicker" type="text" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定"></input></td>
				<td><input type="button" value="取消"></input></td>
			</tr>
		</table>
	</form>

</body>
</html>
