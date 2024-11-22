package id.go.kemenag.spn.config;

import id.go.kemenag.spn.config.property.ApplicationSettingProperty;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class SwaggerConfig {

    private ApplicationSettingProperty applicationSettingProperty;
}
