package id.go.kemenag.spn.entity;

import id.go.kemenag.spn.constant.ApplicationConstant;
import id.go.kemenag.spn.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

//@Data
//@Builder
//@EqualsAndHashCode(callSuper = true)
//@Entity
public class User extends BaseEntity {

    @Column
    @UuidGenerator(style = UuidGenerator.Style.AUTO)
    private UUID id;

    @Column
    @NotBlank
    private String username;

    @Column
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.ROLE role;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    @NotBlank
    private String password;

    @Column
    private String workplaceCode;

    @Column
    private String workplaceName;
}
