package id.go.kemenag.spn.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTests {

    @InjectMocks
    UserServiceImpl userService;

    @Test
    void should_return_hello_world() {

        assertEquals("Hello World", this.userService.test());
    }
}
