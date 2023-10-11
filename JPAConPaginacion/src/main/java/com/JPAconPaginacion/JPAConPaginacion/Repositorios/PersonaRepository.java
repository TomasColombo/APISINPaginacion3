package com.JPAconPaginacion.JPAConPaginacion.Repositorios;


import com.JPAconPaginacion.JPAConPaginacion.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    // anotacion metodo query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre,String apellido);

    // con paginacion
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //--------o--------------
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List <Persona> search(@Param("filtro") String filtro);

    // con paginacion

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page <Persona> search(@Param("filtro") String filtro, Pageable pageable);


    @Query(
            value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%",
            nativeQuery=true
    )
    List <Persona> searchNativo(@Param("filtro") String filtro);

    // con paginacion

    @Query(
            value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%",
            countQuery = "SELECT count (*) FROM persona ",
            nativeQuery=true
    )
    Page <Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
