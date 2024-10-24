package com.hendisantika.adminlte.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Condicion;

public interface CondicionRepository extends JpaRepository<Condicion, Integer> {

   // @Query(value = "SELECT * FROM Condicion", nativeQuery = true)
   // List<Condicion> findAllCondiciones();
}
