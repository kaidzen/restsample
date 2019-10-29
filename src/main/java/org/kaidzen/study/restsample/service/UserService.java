package org.kaidzen.study.restsample.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserService<T> {

    Optional<T> findOne(String id);
    void saveOne(T entity);
    List<T> findAll();
}
