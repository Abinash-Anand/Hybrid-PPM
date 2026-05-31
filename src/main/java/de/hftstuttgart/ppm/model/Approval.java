package de.hftstuttgart.ppm.model;

public class Approval {

    private Long approvalId;

    private Long projectId;

    private Long approverId;

    private String status;

    private String comments;

    /**
     * @return Long return the approvalId
     */
    public Long getApprovalId() {
        return approvalId;
    }

    /**
     * @param approvalId the approvalId to set
     */
    public void setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
    }

    /**
     * @return Long return the projectId
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * @return Long return the approverId
     */
    public Long getApproverId() {
        return approverId;
    }

    /**
     * @param approverId the approverId to set
     */
    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return String return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

}