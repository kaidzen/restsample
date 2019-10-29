package org.kaidzen.study.restsample.controller;

import org.kaidzen.study.restsample.model.User;
import org.kaidzen.study.restsample.service.RestUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/api")
public class RestUserController {

    private final RestUserService restUserService;

    public RestUserController(RestUserService restUserService) {
        this.restUserService = restUserService;
    }

    @GetMapping("/user/users")
    public List<User> getAllusers() {
        return restUserService.findAll();
    }

    @GetMapping("/user/{name}")
    public User findUser(@PathVariable String name){
        Optional<User> optUser = restUserService.findOne(name);
        return optUser.orElse(new User("newbie", "newest", 1));
    }


}
