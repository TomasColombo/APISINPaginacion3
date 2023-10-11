package com.JPAconPaginacion.JPAConPaginacion.Repositorios;

import com.JPAconPaginacion.JPAConPaginacion.Entidades.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean //para que no se generen instanias de la clase Interface
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E,ID> {

}
