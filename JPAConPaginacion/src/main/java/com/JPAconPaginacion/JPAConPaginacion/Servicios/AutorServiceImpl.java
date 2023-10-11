package com.JPAconPaginacion.JPAConPaginacion.Servicios;

import com.JPAconPaginacion.JPAConPaginacion.Entidades.Autor;
import com.JPAconPaginacion.JPAConPaginacion.Repositorios.AutorRepository;
import com.JPAconPaginacion.JPAConPaginacion.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository ;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }

}