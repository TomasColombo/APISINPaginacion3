package com.JPAconPaginacion.JPAConPaginacion.Servicios;

import com.JPAconPaginacion.JPAConPaginacion.Entidades.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable>{
    // Con <E extends Base, ID extends Serializable> estamos buscando reutilizar el codigo
    //Creamos los metodos principales que siempre usamos, creacion, recuperacion, actualizacion y Eliminacion
    //Recibe <E> que es recbe una entidad cualquiera

    public List<E> findAll() throws Exception;

    // paginacion, devuelve un page no un list
    public Page<E> findAll(Pageable pageable) throws Exception;


    public E findById(ID id ) throws Exception; // estaban declarado como Long pero lo cambiamos a ID para que sea generico
    public E save(E entity) throws Exception;
    public E update(ID id, E entity ) throws Exception;
    public boolean delete (ID id ) throws Exception;



}
