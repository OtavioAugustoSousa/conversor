function calcularTem() {
    var de = $("select[name='de']").val();
    var para = $("select[name='para']").val();
    if (de == para) {
	$('#error').openModal();
    } else {
	var grau = $("#grau").val();

	$.getJSON("rest/" + de + "to" + para + "/" + grau, {
	    url : window.location.pathname
	}, function(json) {
	    grau = json.grau;
	    $("#tagC").html(grau);
	    changeTemper(grau);
	});

    }

}

function changeTemper(temp) {
    var corpo = $("#corpoC");
    var tamanho = parseInt(corpo.css("length"));
    var top = parseInt($("#tagC").css("top"));
    var porcent = 0;
    var tagPosition = -132;
    var mult = 0.25;

    porcent += 50;
    porcent -= temp * mult;

    var background = "linear-gradient(to bottom, white 0%,white " + porcent + "%,#000000 " + porcent + "%,red " + porcent + "%,red 100%)";
    corpo.css({
	"background" : background
    });

    var newPosition = ((tamanho / 2 / 1000) * temp) + tagPosition;

    $("#tagC").css({
	"top" : ((-1) * newPosition) + "px"
    });
}
