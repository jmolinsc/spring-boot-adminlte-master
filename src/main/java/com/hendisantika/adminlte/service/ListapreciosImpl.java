package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Listaprecios;
import com.hendisantika.adminlte.repository.ListapreciosRepository;

@Service
public class ListapreciosImpl implements ListapreciosService {

    @Autowired
    ListapreciosRepository listapreciosRepository;

    @Override
    public List<Listaprecios> findAll() {
        return listapreciosRepository.findAll();

    }

}
