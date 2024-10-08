package com.hendisantika.adminlte.service;

import java.util.List;

import com.hendisantika.adminlte.datatable.Page;
import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.model.Alm;

public interface AlmService {

    Page<Alm> getPaginatedDatatable(PagingRequest pagingRequest);
   
}
