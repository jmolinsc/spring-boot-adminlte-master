package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Unidad;
import com.hendisantika.adminlte.repository.UnidadRepository;

@Service
public class UnidadImpl implements UnidadService {

    @Autowired
    UnidadRepository unidadRepository;

    @Override
    public List<Unidad> findAllUnidad() {
        return unidadRepository.findAllUnidad();
    }

}
