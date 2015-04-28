$(function() {
	$("#newBtn").click(
			function() {
				// $(window.parent.frames["mainFrame"].document).contents().find(
				// "#newPlanDialog")[0].open = true;
				var s = $(window.parent.frames["mainFrame"].document)
						.contents().find("#newPlanDialog");
				s.dialog('open');

			});
});