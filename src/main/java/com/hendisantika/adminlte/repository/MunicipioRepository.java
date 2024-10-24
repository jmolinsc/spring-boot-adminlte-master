package com.hendisantika.adminlte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Municipio;
import com.hendisantika.adminlte.model.Pais;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

    @Query(value = "SELECT * FROM Municipio", nativeQuery = true)
    List<Municipio> findAllMuncipio();

}
