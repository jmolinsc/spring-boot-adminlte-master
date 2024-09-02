package com.hendisantika.adminlte.service;

import com.hendisantika.adminlte.datatable.Page;
import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.model.Alm;
import com.hendisantika.adminlte.model.Art;

public interface ArtService {

    Page<Art> getPaginatedDatatable(PagingRequest pagingRequest);

}
