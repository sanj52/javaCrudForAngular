package com.sanjay.service.Impl;

import com.sanjay.service.GenericService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * @author prabesh
 * @since April 18, 2018
 */

public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

    private JpaRepository<T, ID> jpaRepository;

    public GenericServiceImpl(JpaRepository<T, ID> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    /**
     * Implementation of {@link GenericService#saveOrUpdate(Object)}.
     */
    @Override
    public T saveOrUpdate(T entity) {
        return jpaRepository.save(entity);
    }


    /**
     * Implementation of {@link GenericService#deleteById(Serializable)}.
     */
    @Override
    public void deleteById(ID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public List<T> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public T getOne(ID id) {
        return jpaRepository.getOne(id);
    }
}


