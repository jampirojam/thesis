package id.go.kemenag.spn.constant;

public class WorkflowConstant {

    public WorkflowConstant() throws Exception {
        throw new Exception("Utility");
    }

    public enum WorkflowStatus {
        COMPLETE,
        INCOMPLETE,
    }

    public static final String APPLICATION_ID_VARIABLE_KEY = "applicationId";

    public static final String WORKFLOW_CREATE_ORDER = "createOrder";
}
