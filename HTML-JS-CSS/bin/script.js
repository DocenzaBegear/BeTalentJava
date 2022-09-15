	document.getElementById("bottone1").addEventListener("click", cambiaScritta);
	document.getElementById("bottone2").addEventListener("click", cancellaScritta);

	function cambiaScritta() {
  		document.getElementById("demo").innerHTML = 'Ciao cari';
	}
	
	function cancellaScritta() {
  		document.getElementById("demo").innerHTML = '';
	}
	
	function lanciaAlert(event) {
		alert("Messaggio di alert");
	}