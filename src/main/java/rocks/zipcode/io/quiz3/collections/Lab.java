package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName;
    private LabStatus labStatus;

    public Lab() {
        this("");
    }

    public Lab(String labName) {
        this.labName = labName;
        this.labStatus = LabStatus.PENDING;
    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return this.labStatus;
    }
}
