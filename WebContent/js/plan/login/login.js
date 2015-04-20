if (self.location != top.location) {
	top.location.href = self.location.href;
}
$("#userId").val(getCookie("userName"));
$("#userId").focus();

function checkForm() {
	if ($("#userId").attr("value") == "") {
		alert('userId is required!');
		$("#userId").focus();
		return false;
	}
	if ($("#password").attr("value") == 0) {
		alert('Password is required!');
		$("#password").focus();
		return false;
	}

	if ($("#userId").attr("value").indexOf("\'") >= 0
			|| $("#userId").attr("value").indexOf("\"") >= 0
			|| $("#userId").attr("value").length > 20) {
		alert('UserId  is not correct!');
		$("#userId").focus();
		return false;
	}

	if ($("#password").attr("value").indexOf("\'") >= 0
			|| $("#password").attr("value").indexOf("\"") >= 0
			|| $("#password").attr("value").length > 20) {
		alert('password  is not correct!');
		$("#password").focus();
		return false;
	}

	else {
		$("#loginForm").submit();
	}
}

$("#userId").keydown(function(event) {
	if (event.keyCode == 13) {
		checkForm();
	}
});
$("#password").keydown(function(event) {
	if (event.keyCode == 13) {
		checkForm();
	}
});
$("#remeberId").keydown(function(event) {
	if (event.keyCode == 13) {
		checkForm();
	}
});
function getCookie(c_name) {
	if (document.cookie.length > 0) {
		c_start = document.cookie.indexOf(c_name + "=");
		if (c_start != -1) {
			c_start = c_start + c_name.length + 1;
			c_end = document.cookie.indexOf(";", c_start);
			if (c_end == -1)
				c_end = document.cookie.length;
			return unescape(document.cookie.substring(c_start, c_end));
		}
	}
	return "";
}

$(function() {
	$("#registerBtn").click(function() {
		$("form[name='registerForm']").attr("action", "login!register.action");
		$("form[name='registerForm']").submit();
	});

});