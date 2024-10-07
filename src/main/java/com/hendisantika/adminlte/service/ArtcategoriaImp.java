package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Artcategoria;
import com.hendisantika.adminlte.repository.ArtcategoriaRepository;


@Service
public class ArtcategoriaImp implements ArtcategoriaService {

    @Autowired
    ArtcategoriaRepository artcategoriaRepository;

    @Override
    public List<Artcategoria> findAllArtCategoria() {

        return artcategoriaRepository.findAllArtCategoria();
    }

}
