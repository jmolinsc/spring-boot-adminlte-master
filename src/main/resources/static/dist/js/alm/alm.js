/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

$(function () {
    $("#btnNuevo").click(function () {
        alert("test");
    });

    const table = new DataTable('#example', {
        "serverSide": true,
        "bSort": true,
        "scrollY": '40vh',
        "ajax": {
            "url": "/alm/data",
            "type": "POST",
            "dataType": "json",
            "contentType": "application/json; charset=utf-8",
            "data":
                function (d) {
                    // this to see what is being sent to the server
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
            { "data": 'almacen', "name": 'almacen', "width": '60px', "class": 'text-center' },
            { "data": "nombre", "name": 'nombre', "width": '500px', "class": 'text-center' },
            { "data": "telefonos", "name": 'telefonos', "width": '100px', "class": 'text-center' },
            {
                "data": '',
                "name": '', "width": '50px', "class": 'text-center',
                "render": (data, type, row) => {
                    console.log(row)
                    return `<a href='${'/alm/edit/' + row.almacen}'><i class="fa fa-pencil"/></a>`;
                }
            }
        ]
    });
})






