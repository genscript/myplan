
<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>My Plan「计划」</title>
<link type="text/css" href="css/jquery/themes/base/ui.all.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${global_css_url}jquery.validate.css" />
<script type="text/javascript" src="${global_js_url}jquery/jquery.js"></script>
<script type="text/javascript" src="${global_js_url}jquery/jquery.form.js"></script>
<script type="text/javascript" src="${global_js_url}jquery/jquery.validate.js"></script>

</head>
<body>
	<div>
		<form action="login!register.action" method="post" id="registerForm">
			<div>
				<table>
					<tr>
						<td width="31%" height="28" class="login_font">用户名 ：<input
							name="userDto.userName" type="text" value="${userDto.userName }"></input></td>
					</tr>
					<tr>
						<td width="31%" height="28" class="login_font">邮箱 ：<input
							name="userDto.busEmail" type="text" value="${userDto.busEmail }"></input>
						</td>
					</tr>
					<tr>
						<td width="31%" height="28" class="login_font">密码 ：<input
							name="userDto.password" type="password"
							value="${userDto.password}"></input>
						</td>
					</tr>
					<tr>
						<td width="31%" height="28" class="login_font">确认密码 ：<input
							name="userDto.reConfrimPassword" type="password"
							value="${userDto.reConfrimPassword }"></input>
						</td>
					</tr>
					<tr>
						<td><input type="submit" class="login_button" value="确认"
							id="comfirmRegisterBtn"></input></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
	<script>
		$(function() {
    
			// validate signup form on keyup and submit
			$("#registerForm").validate({
				errorClass : "validate_error",
				highlight : function(element, errorClass) {
					$(element).addClass(errorClass);
				},
				unhighlight : function(element, errorClass, validClass) {
					$(element).removeClass(errorClass);
				},
				invalidHandler : function(form, validator) {
					$.each(validator.invalid, function(key, value) {
						alert(value);
						$("#" + key).focus();
						return false;
					});
				},
				rules : {
					"userDto.userName" : {
						required:true , maxlength : 50
					},
					"userDto.busEmail" : {
						required:true ,maxlength : 50
					},
					"userDto.password" : {
						required:true ,maxlength : 12
					},
					"userDto.reConfrimPassword" : {
						required:true ,maxlength : 12
					}
				},
				messages : {
					"userDto.userName" : {
						required:"请输入用户名" ,maxlength : "User Name   - Max length: 50 characters"
					},
					"userDto.busEmail" : {
						required:"请输入邮箱" ,maxlength : "Bus Email   - Max length: 50 characters"
					},
					"userDto.password" : {
						required:"请输入密码" ,maxlength : "Password: -Max length 12 characters"
					},
					"userDto.reConfrimPassword" : {
						required:"请再次确认密码" ,maxlength : "reConfrimPassword: -Max length 12 characters"
					}
				},
				errorPlacement : function(error, element) {
				}
			});
			if($("input[name='userDto.password']").val() != $("input[name='userDto.reConfrimPassword']").val()){
				 alert("请与密码保持一致");
				 return false;
			} 
		});
	</script>
</body>
</html>