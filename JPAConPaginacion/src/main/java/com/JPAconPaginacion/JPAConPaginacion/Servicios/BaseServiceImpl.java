package com.JPAconPaginacion.JPAConPaginacion.Servicios;

import com.JPAconPaginacion.JPAConPaginacion.Entidades.Base;
import com.JPAconPaginacion.JPAConPaginacion.Repositorios.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> baseRepository; //para poder acceder cuando hereden los metodos, esta pueda ser accedida

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }



    @Override
    @Transactional // significa que estos metodos relaiza trasacciones con las bases de datos.
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    /// paginacion ;

    @Override
    @Transactional // significa que estos metodos relaiza trasacciones con las bases de datos.
    public Page<E> findAll(Pageable pageable) throws Exception {
        try{
            Page<E> entities = baseRepository.findAll(pageable);
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }




    @Override
    @Transactional

    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());

        }

    }

    @Override
    @Transactional

    public E save(E entity) throws Exception {
        try{
            entity=baseRepository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return entity;
    }

    @Override
    @Transactional

    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            E entiti =entityOptional.get();
            entity=baseRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional

    public boolean delete(ID id) throws Exception {
        try{
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

}
