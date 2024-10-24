package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Departamento;
import com.hendisantika.adminlte.repository.DepartamentoRepository;

@Service
public class DepartamentoImpl implements DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> findAllDepartamentos() {
        return departamentoRepository.findAllDepartamentos();
    }

}
