package id.go.kemenag.spn.entity;

import id.go.kemenag.spn.constant.ApplicationConstant;
import id.go.kemenag.spn.dto.base.KeyValuePair;
import id.go.kemenag.spn.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Data
@Builder
//@EqualsAndHashCode(callSuper = true)
//@Entity
public class Application extends BaseEntity {

    @Column
    @UuidGenerator(style = UuidGenerator.Style.AUTO)
    private UUID id;

    @Column
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.Status status;

    @Column
    private String processId;

    @Column
    private Integer sequence;

    @Column
    private Collection<KeyValuePair> workflows = new ArrayList<>();
}
