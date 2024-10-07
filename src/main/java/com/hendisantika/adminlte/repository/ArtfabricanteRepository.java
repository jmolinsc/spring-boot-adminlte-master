package com.hendisantika.adminlte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Artcategoria;
import com.hendisantika.adminlte.model.Artfabricante;

public interface ArtfabricanteRepository extends JpaRepository<Artfabricante, Integer> {

    @Query(value = "SELECT * FROM Artfabricante", nativeQuery = true)
    List<Artfabricante> findAllArtfabricante();
}
