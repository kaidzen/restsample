package org.kaidzen.study.restsample.repository;

import org.kaidzen.study.restsample.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByName(String name);

    @Override
    Iterable<User> findAll();
}
