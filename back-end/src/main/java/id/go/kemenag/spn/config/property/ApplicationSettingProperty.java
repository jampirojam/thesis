package id.go.kemenag.spn.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "setting")
public class ApplicationSettingProperty {

    private Security security;

    @Data
    public static class Security {

        private BaseSecurity application;

        @Data
        public static class BaseSecurity {

            private String key;

            private String value;
        }
    }
}
