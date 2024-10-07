package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Artfamilia;
import com.hendisantika.adminlte.repository.ArtfamiliaRepository;

@Service
public class ArtfamiliaImpl implements ArtfamiliaService {

    @Autowired
    ArtfamiliaRepository artfamiliaRepository;

    @Override
    public List<Artfamilia> findAllArtfamilias() {

        return artfamiliaRepository.findAll();
    }

}
