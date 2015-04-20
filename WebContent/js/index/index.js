$(function() {

//	$('#loginDialog').attr("style", "display:none").dialog({
//		autoOpen : false,
//		height : 460,
//		width : 720,
//		modal : true,
//		bgiframe : true,
//		open : function() {
//
//		}
//	
//	});
	
	$("#timeline").click(function() {
		$("#loginForm").submit();

		return false;
	});
//	$("input[name='loginBtn']").click(function() {
//		$("#loginForm").attr("action", "login!home.action");
//		$("#loginForm").submit();
//	});
//
//	$("#userName,#password").focus(function() {
//		if ($(this).attr("name") == "userName") {
//			$(this).css("background-positionY", "-108px");
//		} else {
//			$(this).css("background-positionY", "-187px");
//		}
//	}).blur(function() {
//		if ($(this).attr("name") == "userName") {
//			$(this).css("background-positionY", "-68px");
//		} else {
//			$(this).css("background-positionY", "-147px");
//		}
//	});
});

