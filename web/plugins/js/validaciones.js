

window.addEventListener('load', function () {
//alert("Cargado");
    document.getElementById('newEmpresa').addEventListener('click', function () {
//alert('click...');
        var nombreEmpresa = document.getElementById('nombreEmpresa').value;
        var nitEmpresa = document.getElementById('nitEmpresa').value;
        var numeroAutorizacionEmpresa = document.getElementById('numeroAutorizacionEmpresa').value;
        var fechaFundacionEmpresa = document.getElementById('fechaFundacionEmpresa').value;
        var bandera = nombreEmpresa.length > 0 && nitEmpresa.length > 0 && numeroAutorizacionEmpresa.length > 0 && fechaFundacionEmpresa.length > 0;
        if (bandera) {
//            alert('Campos llenos...');
            $.post('newempresa.do', {
                nombreEmpresa: nombreEmpresa,
                nitEmpresa: nitEmpresa,
                numeroAutorizacionEmpresa: numeroAutorizacionEmpresa,
                fechaFundacionEmpresa: fechaFundacionEmpresa
            }, function (responseText) {
                if (responseText === "true") {
                    $('#tabla').html("<div class=\"panel-body\"><div class=\"alert alert-success text-center\">Usuario Correcto</div></div>");
                    window.location.href = "menu.jsp";
                } else {
                    $('#tabla').html("<div class=\"panel-body\"><div class=\"alert alert-danger text-center\">Usuario Incorrecto</div></div>");
                }


            });
//            document.getElementById('formInicio').submit();
        } else {
            alert('Rellene todos los campos...');
        }
    });
});

//$(document).ready(function () {
//    $('#enviarDatos').click(function (event) {
//        var username = $('#username').val();
//        var password = $('#password').val();
//        //alert("usuario: " + username);
//        //alert("pass: " + password);
//        // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
//        $.post('login.do', {
//            username: username,
//            password: password
//        }, function (responseText) {
//
//            $('#tabla').html(responseText);
//        });
//        //alert("hola");
//    });
//});