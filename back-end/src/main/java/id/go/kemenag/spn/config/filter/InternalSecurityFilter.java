package id.go.kemenag.spn.config.filter;

import id.go.kemenag.spn.config.property.ApplicationSettingProperty;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@AllArgsConstructor
public class InternalSecurityFilter extends OncePerRequestFilter {

    private final ApplicationSettingProperty applicationSettingProperty;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        var keySecret = request.getHeader(this.applicationSettingProperty.getSecurity().getApplication().getKey());

        if (this.applicationSettingProperty.getSecurity().getApplication().getValue().equals(keySecret)) {
            filterChain.doFilter(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid API Secret");
        }
    }
}
