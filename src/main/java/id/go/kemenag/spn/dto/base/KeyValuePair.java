package id.go.kemenag.spn.dto.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class KeyValuePair {

    private String key;
    private String value;
}
