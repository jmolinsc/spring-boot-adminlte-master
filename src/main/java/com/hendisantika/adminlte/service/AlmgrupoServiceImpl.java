package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Almgrupo;
import com.hendisantika.adminlte.repository.AlmgrupoRepository;

@Service
public class AlmgrupoServiceImpl implements AlmgrupoService {

    @Autowired
    AlmgrupoRepository almgrupoRepository;

    @Override
    public List<Almgrupo> findAllAlta() {
        // TODO Auto-generated method stub
        return almgrupoRepository.findAllAlmgrupo();
    }

}
