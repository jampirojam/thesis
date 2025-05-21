package id.go.kemenag.spn.config.property;

import jakarta.validation.constraints.NotBlank;
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

            @NotBlank
            private String key;

            @NotBlank
            private String value;
        }
    }

    private Feature feature;

    @Data
    public static class Feature {

        private Config config;

        @Data
        public static class Config {

            private boolean featSkipApproach;
            private boolean featReprocessApproach;
        }
    }
}
