package com.hendisantika.adminlte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Almgrupo;
import com.hendisantika.adminlte.model.Unidad;

public interface UnidadRepository extends JpaRepository<Unidad, Integer> {

    @Query(value = "SELECT * FROM Unidad", nativeQuery = true)
    List<Unidad> findAllUnidad();

}
