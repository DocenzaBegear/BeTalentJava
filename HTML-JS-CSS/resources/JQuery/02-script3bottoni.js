
	$(function() {
		$("#bottone1").on("click", function() {
			$("#p1").toggle();
		})
		$("#bottone2").on("click", function() {
			$("#p2").toggle();
		})
		$("#bottone3").on("click", function() {
			$("#p3").toggle();
		})
	})
	
	$(function() {
		$(".bottone").on("click", function() {
			var data = $(this).attr("data-scritta");
			$("#"+data).toggle();
		})
	})