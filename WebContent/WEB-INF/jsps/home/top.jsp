<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>top</title>
<link rel="stylesheet" type="text/css" href="css/home/top.css" />
<script type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>

</head>

<body >
	<div >
		<p class="top_title">让坚持从此简单</p>
		<p class="top_user"><a  href="<s:url action='login_out'/>" target="_parent">退出</a>
		<span>${userName} </span>
		</p>
	</div>
</html>
