package id.go.kemenag.spn.config;

import id.go.kemenag.spn.config.filter.InternalSecurityFilter;
import id.go.kemenag.spn.config.property.ApplicationSettingProperty;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {

    private final ApplicationSettingProperty applicationSettingProperty;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        InternalSecurityFilter internalSecurityFilter = new InternalSecurityFilter(applicationSettingProperty);

        http
            .csrf(AbstractHttpConfigurer::disable)
            .cors(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
            )
            .addFilterBefore(internalSecurityFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
