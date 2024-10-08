package com.hendisantika.adminlte.service;
import java.util.List;
import java.util.Optional;

import com.hendisantika.adminlte.datatable.Page;
import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.model.Cte;


public interface CteService {

    Page<Cte> getPaginatedDatatable(PagingRequest pagingRequest);

    Optional<Cte> findById(String cliente);

    Cte save(Cte cte);

}
