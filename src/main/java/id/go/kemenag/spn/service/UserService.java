package id.go.kemenag.spn.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    String test();

    UserDetails loadUserByUsername(String username);
}
