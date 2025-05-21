package id.go.kemenag.spn.dto.application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import id.go.kemenag.spn.dto.bride.request.BrideCreateRequest;
import id.go.kemenag.spn.dto.bride.request.BrideFatherCreateRequest;
import id.go.kemenag.spn.dto.bride.request.BrideMotherCreateRequest;
import id.go.kemenag.spn.dto.groom.request.GroomCreateRequest;
import id.go.kemenag.spn.dto.groom.request.GroomFatherCreateRequest;
import id.go.kemenag.spn.dto.groom.request.GroomMotherCreateRequest;
import id.go.kemenag.spn.dto.guardian.request.GuardianCreateRequest;
import id.go.kemenag.spn.dto.previousPartner.request.PreviousPartnerCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationCreateRequest {

    @JsonProperty("bride")
    private BrideCreateRequest bride;

    @JsonProperty("bride_father")
    private BrideFatherCreateRequest brideFather;

    @JsonProperty("bride_mother")
    private BrideMotherCreateRequest brideMother;

    @JsonProperty("groom")
    private GroomCreateRequest groom;

    @JsonProperty("groom_father")
    private GroomFatherCreateRequest groomFather;

    @JsonProperty("groom_mother")
    private GroomMotherCreateRequest groomMother;

    @JsonProperty("guardian")
    private GuardianCreateRequest guardian;

    @JsonProperty("previous_partner")
    private PreviousPartnerCreateRequest previousPartner;
}
