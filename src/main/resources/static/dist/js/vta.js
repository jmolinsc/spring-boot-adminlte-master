/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

// A $( document ).ready() block.
$(document).ready(function () {
    debugger
    $('#userTable').DataTable({
        "processing": true,
        "serverSide": true,
        "ajax": "/api/users",
        columns: [
            {
                data: 'firstName',
            },
            {
                data: 'lastName',
            },
            {
                data: 'username',
                render: (data) => `<span class="shadow-sm px-2 py-1 rounded-3 bg-dark text-light">@${data}</span>`
            },
            {
                data: 'email',
                render: (data) => `<a class="text-dark" href="mailto: ${data}"  target="_blank">${data}</a>`
            },
            {
                data: 'status',
                render: (data) => `<span class="badge bg-${data ? 'success' : 'warning'}">${data ? 'active' : 'inactive'}</span>`
            },
        ]
    });
});



