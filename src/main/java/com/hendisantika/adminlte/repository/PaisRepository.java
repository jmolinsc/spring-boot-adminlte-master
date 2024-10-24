package com.hendisantika.adminlte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, String> {

    @Query(value = "SELECT * FROM Pais", nativeQuery = true)
    List<Pais> findAllPais();
}
