package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Artfabricante;
import com.hendisantika.adminlte.repository.ArtfabricanteRepository;

@Service
public class ArtfabricanteImpl implements ArtfabricanteService {

    @Autowired
    ArtfabricanteRepository artfabricanteRepository;

    @Override
    public List<Artfabricante> findAll() {
        return artfabricanteRepository.findAll();
    }

}
