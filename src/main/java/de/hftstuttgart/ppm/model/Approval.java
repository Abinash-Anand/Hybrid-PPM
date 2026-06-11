package de.hftstuttgart.ppm.model;

public class Approval {

    private Long approvalId;

    private Long projectId;

    private Long approverId;

    private String status;

    private String comments;

    public Long getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
    }


    public Long getProjectId() {
        return projectId;
    }


    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }


    public Long getApproverId() {
        return approverId;
    }


    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getComments() {
        return comments;
    }


    public void setComments(String comments) {
        this.comments = comments;
    }

}