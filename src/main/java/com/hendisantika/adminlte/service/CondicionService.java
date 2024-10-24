package com.hendisantika.adminlte.service;

import java.util.List;
import java.util.Optional;

import com.hendisantika.adminlte.model.Condicion;

public interface CondicionService {
     List<Condicion> findAllCondiciones();

     List<Condicion> findAll();
}
