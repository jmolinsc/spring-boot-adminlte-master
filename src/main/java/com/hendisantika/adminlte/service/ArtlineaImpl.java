package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Artlinea;
import com.hendisantika.adminlte.repository.ArtlineaRepository;

@Service
public class ArtlineaImpl implements ArtlineaService {

    @Autowired
    ArtlineaRepository artlineaRepository;

    @Override
    public List<Artlinea> findAll() {

        return artlineaRepository.findAll();

    }

}
