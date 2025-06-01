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
        // Petugas Pendaftaran Nikah di Desa
        REGISTRAR,
        // Kepala Desa
        HEADMAN,
        // Petugas KUA
        OFFICER,
        // Kepala KUA
        REVIEWER,
        USER,
        SUPER_USER,
    }

    public enum ProcessApproach {
        SKIP,
        REPROCESS,
    }

    public static final String API_KEY_VALID_ATTRIBUTE = "IS_API_KEY_VALID";
}
