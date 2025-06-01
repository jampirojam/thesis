package id.go.kemenag.spn.entity;

import id.go.kemenag.spn.constant.MarriageConstant;
import id.go.kemenag.spn.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

public class Bride extends BaseEntity {

    @Column
    @UuidGenerator(style = UuidGenerator.Style.AUTO)
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "bride_father_id", referencedColumnName = "id")
    private BrideFather brideFather;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "bride_mother_id", referencedColumnName = "id")
    private BrideMother brideMother;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name ="previous_partner_id", referencedColumnName = "id")
    private PreviousPartner previousPartner;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "guardian_id", referencedColumnName = "id")
    private Guardian guardian;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String alias;

    @Column
    @Size(min = 16, max = 16)
    private String identityId;

    @Column
    private String birthPlace;

    @Column
    private LocalDate birthDate;

    @Column
    private MarriageConstant.Gender gender;

    @Column
    private String job;

    @Column
    private String nationality;

    @Column
    private MarriageConstant.Religion religion;

    @Column
    private MarriageConstant.MaritalStatus maritalStatus;

    @Column
    private String phoneNumber;

    @Column
    private String provinceCode;

    @Column
    private String provinceName;

    @Column
    private String cityCode;

    @Column
    private String cityName;

    @Column
    private String districtCode;

    @Column
    private String districtName;

    @Column
    private String subDistrictCode;

    @Column
    private String subDistrictName;

    @Column
    private String address;

    @Column
    @Size(min = 3, max = 3)
    private String rw;

    @Column
    @Size(min = 3, max = 3)
    private String rt;

    @Column
    private String zipCode;
}
