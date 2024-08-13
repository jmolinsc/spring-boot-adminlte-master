package com.hendisantika.adminlte.service;

import com.hendisantika.adminlte.model.AbstractModel;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public abstract class AbstractService<T extends AbstractModel<Integer>, Integer extends Serializable> {

    private static final int PAGE_SIZE = 5;

    protected abstract JpaRepository<T, Integer> getRepository();

    public Page<T> getList(int pageNumber) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, PAGE_SIZE, Sort.Direction.ASC, "id");

        return getRepository().findAll(pageRequest);
    }

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public T get(Integer id) {
        Optional<T> entityOpt = getRepository().findById(id);
        T entity = entityOpt.get();
        return entity;
    }

    public void delete(Integer id) {
        try {
            getRepository().deleteById(id);
        } catch (EmptyResultDataAccessException e) {
        }
    }

    public void update(T entity) {
        Optional<T> getEntityOpt = getRepository().findById(entity.getId());
        T getEntity = getEntityOpt.get();
        getRepository().save(entity);
    }

}
