package com.hendisantika.adminlte.controller;

import com.hendisantika.adminlte.datatable.Page;
import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.model.Alm;
import com.hendisantika.adminlte.service.AlmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahmed Nafisul Bari
 */

 @Controller

public class PersonController {

    @Autowired
    private AlmService almService;

    
    @PostMapping("/dt")
    @ResponseBody
    public Page<Alm> getPaginatedDatatable(@RequestBody PagingRequest pagingRequest) {

        return almService.getPaginatedDatatable(pagingRequest);
    }
}
