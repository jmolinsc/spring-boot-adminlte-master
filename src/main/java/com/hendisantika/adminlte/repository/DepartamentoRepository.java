package com.hendisantika.adminlte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Departamento;
import com.hendisantika.adminlte.model.Municipio;

public interface DepartamentoRepository extends JpaRepository<Departamento,Integer>{

     @Query(value = "SELECT * FROM Departamento", nativeQuery = true)
    List<Departamento> findAllDepartamentos();

}
