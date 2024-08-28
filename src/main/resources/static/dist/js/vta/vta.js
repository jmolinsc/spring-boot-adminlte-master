/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

$(function () {
    $("#btnNuevo").click(function () {
        alert("test");
    });

    $('#example').DataTable({
        "serverSide": true,
        "bSort": true,
        "ajax": {
            "url": "/alm/data",
            "type": "POST",
            "dataType": "json",
            "contentType": "application/json; charset=utf-8",
            "data":
                function (d) {
                    // this to see what is being sent to the server
                    debugger
                    console.log(d);
                    return JSON.stringify(d);
                },
            "dataFilter": function (response) {
                // this to see what is being received from the server
                console.log(response);
                return response;
            },
            "error": function (xhr, error, code) {
                alert(error + ' : ' + code);
            }
        },
        "columns": [
            {"data": "almacen"},
            {"data": "nombre"},
            {"data": "telefonos"}
        ]
    });
})







