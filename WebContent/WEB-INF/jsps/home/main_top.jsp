<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>main top</title>
<link rel="stylesheet" type="text/css"
	href="${global_css_url}home/main_top.css" />
<script type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>
<script type="text/javascript"
	src="${global_js_url}plan/home/main_top.js"></script>

</head>

<body>
	<span class="dateStyle"> ${dateStr}(星期${week}) </span>
	<span class="buttons"> <span><input type="button"
			value="未完成" /></span> <span><input type="button" value="已完成" /></span> <span><input
			type="button" value="新建" id="newBtn" /></span>
	</span>

</body>
</html>