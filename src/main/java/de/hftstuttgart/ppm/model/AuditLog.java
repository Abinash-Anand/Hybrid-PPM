package de.hftstuttgart.ppm.model;

public class AuditLog {

    private Long auditId;

    private Long userId;

    private String actionType;

    private String entityType;

    private Long entityId;

    private String description;

    private String createdAt;

    public Long getAuditId() {
        return auditId;
    }


    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }


    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }


    public String getEntityType() {
        return entityType;
    }


    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }


    public Long getEntityId() {
        return entityId;
    }


    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getCreatedAt() {
        return createdAt;
    }

 
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    @Override
public String toString() {

    return "AuditLog{" +
            "auditId=" + auditId +
            ", userId=" + userId +
            ", actionType='" + actionType + '\'' +
            ", entityType='" + entityType + '\'' +
            ", entityId=" + entityId +
            ", description='" + description + '\'' +
            ", createdAt='" + createdAt + '\'' +
            '}';
}
}
