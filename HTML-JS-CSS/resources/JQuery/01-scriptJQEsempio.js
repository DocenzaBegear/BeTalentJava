	$(document).ready(function() {
		$("#primoT").delay(1000).hide(1000).show(500);
		$("#secondoT").delay(2500).hide(1000).show(500);
	})
	
	$(function() {
		$("#bottone1").on("click", function() {
			$("#primoT").css({color:"red"});
		})
		$("#bottone2").on("click", function() {
			$("#secondoT").css({color:"yellow"});
		})
		$("#bottone3").on("click", function() {
			$(".tutti").css({color:"black"});
		})
	})

	
	