package com.hendisantika.adminlte.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.datatable.Page;
import com.hendisantika.adminlte.datatable.PagingRequest;
import com.hendisantika.adminlte.datatable.PagingUtil;

import com.hendisantika.adminlte.model.Cte;

import com.hendisantika.adminlte.repository.CteRepository;

@Service
public class CteImpl implements CteService {

    @Autowired
    CteRepository cteRepository;

    @Override
    public Page<Cte> getPaginatedDatatable(PagingRequest pagingRequest) {

        // Mapping DataTables PagingRequest to spring's Pageable
        Pageable pageable = PagingUtil.toPageable(pagingRequest);
        String searchTerm = PagingUtil.toSearchTerm(pagingRequest);

        org.springframework.data.domain.Page<Cte> filteredRecordsPage = cteRepository.getPagedData_jpql(searchTerm,
                pageable);

        int availableFilteredRecords = (int) filteredRecordsPage.getTotalElements();
        int totalRecords = (int) cteRepository.count();

        return new Page<>(filteredRecordsPage.getContent(), availableFilteredRecords, totalRecords);
    }

    @Override
    public Optional<Cte> findById(String cliente) {
        return cteRepository.findById(cliente);

    }

    @Override
    public Cte save(Cte cte) {
        return cteRepository.save(cte);
    }

}
