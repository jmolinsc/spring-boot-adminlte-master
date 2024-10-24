package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Pais;
import com.hendisantika.adminlte.repository.PaisRepository;

@Service
public class PaisImpl implements PaisService {

    @Autowired
    PaisRepository paisRepository;

    @Override
    public List<Pais> findAllPais() {
        return paisRepository.findAllPais();
    }

}
