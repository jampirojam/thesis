package id.go.kemenag.spn.util;

import id.go.kemenag.spn.constant.ApplicationConstant;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AuthUtil {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String hash(String plainPassword) {
        return encoder.encode(plainPassword);
    }

    public static boolean matches(String plainPassword, String hashedPassword) {
        return encoder.matches(plainPassword, hashedPassword);
    }

    public static String hasRole(ApplicationConstant.ROLE role) {
        return "ROLE_" + role.name();
    }
}
