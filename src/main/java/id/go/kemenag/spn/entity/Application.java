package id.go.kemenag.spn.entity;

import id.go.kemenag.spn.constant.ApplicationConstant;
import id.go.kemenag.spn.dto.base.KeyValuePair;
import id.go.kemenag.spn.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

//@Data
//@Builder
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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "bride_id", referencedColumnName = "id")
    private Bride bride;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "groom_id", referencedColumnName = "id")
    private Groom groom;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "marriage_id", referencedColumnName = "id")
    private Marriage marriage;
}
