package id.go.kemenag.spn.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.ZonedDateTime;

@Entity
public class BaseEntity {

    @Column
    private int version;

    @Column(updatable = false)
    private ZonedDateTime createdAt;

    @Column
    private String createdBy;

    @Column
    private boolean deleted;

    @Column
    private ZonedDateTime deletedAt;

    @Column
    private ZonedDateTime updatedAt;

    @Column
    private String updatedBy;
}
