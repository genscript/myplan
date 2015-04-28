$(function() {
	$('#newPlanDialog').dialog({
		autoOpen : true,
		height : 370,
		width : 620,
		modal : true,
		bgiframe : true,
		
	});
	$('#datetimepicker').click(function() {
		$(this).datetimepicker({
			lang : 'ch',// 中文化});

		});
	});
});