package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Condicion;
import com.hendisantika.adminlte.repository.CondicionRepository;

@Service
public class CondicionImpl implements CondicionService {

    @Autowired
    CondicionRepository condicionRepository;

 /*   @Override
    public List<Condicion> findAllCondiciones() {
       //return condicionRepository.findAllCondiciones();
    }*/

}
