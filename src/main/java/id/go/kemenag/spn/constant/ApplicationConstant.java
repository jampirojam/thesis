package id.go.kemenag.spn.constant;

public class ApplicationConstant {

    public ApplicationConstant() throws Exception {
        throw new Exception("Utility");
    }

    public enum Status {
        CREATED,
        PROCESSED,
        CANCELLED,
        TRADITIONAL_PROCESS,
        DONE,
    }

    public enum ROLE {
        // Petugas Urusan Nikah
        VILLAGE_OFFICER,
        // Kepala Desa
        VILLAGE_HEAD,
        // Petugas KUA
        RELIGIOUS_AFFAIR_OFFICER,
        // Kepala KUA
        RELIGIOUS_AFFAIR_HEAD,
        DEFAULT,
        SUPER_USER,
    }

    public static final String API_KEY_VALID_ATTRIBUTE = "IS_API_KEY_VALID";
}
