package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Municipio;
import com.hendisantika.adminlte.repository.MunicipioRepository;

@Service
public class MunicipioImpl implements MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;

    @Override
    public List<Municipio> findAllMunicipios() {
        return municipioRepository.findAllMuncipio();
    }

}
