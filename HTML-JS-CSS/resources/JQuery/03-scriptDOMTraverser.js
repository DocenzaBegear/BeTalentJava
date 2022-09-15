
$(function() {
	$("#bottone").on("click", function() {
			$("td").last().css({color:"red"});
		})
		
	$("#ripristina").on("click", function() {
		$("*").css({color:"black"});
	})
})