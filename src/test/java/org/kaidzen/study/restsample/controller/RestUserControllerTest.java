package org.kaidzen.study.restsample.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.kaidzen.study.restsample.service.RestUserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class RestUserControllerTest {

    @Mock
    private RestUserService restUserService;

    @InjectMocks
    private RestUserController controller;

    @Test
    void getAllusers() {
    }

    @Test
    void findUser() {
    }
}