package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Artgrupo;
import com.hendisantika.adminlte.repository.ArtgrupoReporsitory;


@Service
public class ArtgrupoImpl implements ArtgrupoService {

    @Autowired
    ArtgrupoReporsitory artgrupoReporsitory;

    @Override
    public List<Artgrupo> findAll() {
        return artgrupoReporsitory.findAll();

    }

}
