package com.hendisantika.adminlte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hendisantika.adminlte.model.Artcategoria;

public interface ArtcategoriaRepository extends JpaRepository<Artcategoria, Integer> {

    @Query(value = "SELECT * FROM Artcategoria", nativeQuery = true)
    List<Artcategoria> findAllArtCategoria();

}
