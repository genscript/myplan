$(function() {
	$("#newPlan").click(function() {
		$('#newPlanDialog').dialog('open');
	});
	$('#newPlanDialog').dialog({
		autoOpen : false,
		height : 370,
		width : 620,
		modal : true,
		bgiframe : true,
	});
	$('#datetimepicker').click(function() {
		alert("ss");
		$(this).datetimepicker({
			lang : 'ch',// 中文化});

		});
	});
});