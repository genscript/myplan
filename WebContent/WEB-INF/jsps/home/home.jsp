<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>
<script type="text/javascript"
	src="${global_js_url}jquery/jquery.dialog.all.js"></script>
<title>My Plan「计划」</title>
</head>
<frameset rows="100,*" frameborder="NO" border="0" framespacing="0"
	id="rootFrame">
	<frame src="home!top.action" name="topFrame" scrolling="no" border="0"
		framespacing="0" noresize id="topFrame" />
	<frameset cols="85%,*" frameborder="NO" border="0" framespacing="0"
		id="MainSetFrame" name="MainSetFrame">
		<frameset rows="8%,*" frameborder="NO" border="0" framespacing="0"
			id="MainLeftSetFrame" name="MainLeftSetFrame">
			<frame src="home!mainTop.action" name="mainTop" scrolling="no"
				border="0" framespacing="0" noresize id="mainTop" />
			<frameset cols="15%,*" frameborder="NO" border="0" framespacing="0"
				id="MainFrameSet" name="MainFrame">
				<frame src="home!leftMenu.action" name="leftMenuFrame" scrolling="auto"
					noresize id="leftMenuFrame" title="leftMenuFrame" />
				<frame src="home!main.action" name="mainFrame" scrolling="yes"
					id="mainFrame" title="mainFrame" />
			</frameset>
		</frameset>
		<frame src="home!mainRight.action" name="topFrame" scrolling="no"
			border="0" framespacing="0" noresize id="topFrame" />
	</frameset>
</frameset>

<body leftmargin="0" topmargin="0">
</body>
</html>