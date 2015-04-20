
<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>My Plan「计划」</title>
<link rel="stylesheet" type="text/css" href="${global_css_url}login/login.css" />
<script type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>
<script type="text/javascript" src="${global_js_url}jquery/jquery.form.js"></script>
<script type="text/javascript" src="${global_js_url}plan/login/login.js"></script>
</head>

<body>
	<div class="wrap">

		<form action="login.action" method="post" name="loginForm"
			onsubmit="return checkForm()">

			<section class="loginForm">

				<div class="loginForm_content">

					<fieldset>

						<div class="inputWrap">

							<input type="text" name="userDto.userName"
								value="${cookieUserId}" placeholder="邮箱/会员帐号/手机号" autofocus
								required>

						</div>

						<div class="inputWrap">

							<input type="password" name="userDto.password"
								placeholder="请输入密码" required>

						</div>

					</fieldset>

					<fieldset>

						<input type="checkbox" checked="checked"> <span>下次自动登录</span>

						<a href="#">忘记密码？</a> <a href="#" id="registerBtn">注册</a> <input
							type="submit" value="登录">

					</fieldset>

				</div>

			</section>

		</form>

	</div>
	<form name="registerForm" method="post"></form>
</body>

</html>
