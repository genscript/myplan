$(function() {
	$("#newBtn").click(function() {
		//alert(window.parent.frames["MainLeftSetFrame"].document);
		alert($("#MainLeftSetFrame",window.parent.document.body).find("#newPlanDialog").dialog('open'));
	});
});