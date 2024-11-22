package id.go.kemenag.spn.service.impl;

import id.go.kemenag.spn.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String test() {
        return "Hello World";
    }
}
