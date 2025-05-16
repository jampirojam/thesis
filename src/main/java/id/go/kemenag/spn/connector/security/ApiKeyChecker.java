package id.go.kemenag.spn.connector.security;

import id.go.kemenag.spn.constant.ApplicationConstant;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component("apiKeyChecker")
public class ApiKeyChecker {

    public boolean isValid(HttpServletRequest request) {
        Boolean apiKeyValid = (Boolean) request.getAttribute(ApplicationConstant.API_KEY_VALID_ATTRIBUTE);
        return Boolean.TRUE.equals(apiKeyValid);
    }
}
