package com.sanjay.service;

import java.io.Serializable;
import java.util.List;


/**
 * @author prabesh
 * @since April 18, 2018
 */

public interface GenericService<T, ID extends Serializable> {

    /**
     * Either saves or updates the provided entity. If the entity is present in
     * datasource with the same id of the provided entity, then it updates the
     * entity present in datasource; if there's no such entity, it creates the
     * new one in the datasource.
     *
     * @param entity The entity to be saved or updated.
     * @return The saved or updated entity.
     */
    T saveOrUpdate(T entity);


    /**
     * Removes the entity from datasource with the provided id.
     *
     * @param id The id of the entity to be removed.
     */
    void deleteById(ID id);

    List<T> findAll();

    T getOne(ID id);
}

