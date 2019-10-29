package org.kaidzen.study.restsample.service;

import org.kaidzen.study.restsample.model.User;
import org.kaidzen.study.restsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestUserService implements UserService<User> {

    private final UserRepository userRepository;

    @Autowired
    public RestUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findOne(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void saveOne(User entity) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
