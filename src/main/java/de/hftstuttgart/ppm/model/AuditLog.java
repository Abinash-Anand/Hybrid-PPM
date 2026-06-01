package de.hftstuttgart.ppm.model;

public class AuditLog {

    private Long auditId;

    private Long userId;

    private String actionType;

    private String entityType;

    private Long entityId;

    private String description;

    private String createdAt;
    /**
     * @return Long return the auditId
     */
    public Long getAuditId() {
        return auditId;
    }

    /**
     * @param auditId the auditId to set
     */
    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    /**
     * @return Long return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return String return the actionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * @param actionType the actionType to set
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * @return String return the entityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * @param entityType the entityType to set
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * @return Long return the entityId
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * @param entityId the entityId to set
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * @return String return the createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
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
