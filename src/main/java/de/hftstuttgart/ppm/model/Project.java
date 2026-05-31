package de.hftstuttgart.ppm.model;

import java.math.BigDecimal;

public class Project {

    private Long projectId;

    private Long portfolioId;

    private String projectName;

    private String description;

    private String projectType;

    private String status;

    private BigDecimal requestedBudget;

    private Integer strategicAlignmentScore;

    private Integer roiScore;

    private Integer riskScore;

    private Integer innovationScore;

    private Integer feasibilityScore;

    private Double finalScore;

    private Long createdBy;

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
     * @return Long return the portfolioId
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * @param portfolioId the portfolioId to set
     */
    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * @return String return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
     * @return String return the projectType
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * @param projectType the projectType to set
     */
    public void setProjectType(String projectType) {
        this.projectType = projectType;
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
     * @return BigDecimal return the requestedBudget
     */
    public BigDecimal getRequestedBudget() {
        return requestedBudget;
    }

    /**
     * @param requestedBudget the requestedBudget to set
     */
    public void setRequestedBudget(BigDecimal requestedBudget) {
        this.requestedBudget = requestedBudget;
    }

    /**
     * @return Integer return the strategicAlignmentScore
     */
    public Integer getStrategicAlignmentScore() {
        return strategicAlignmentScore;
    }

    /**
     * @param strategicAlignmentScore the strategicAlignmentScore to set
     */
    public void setStrategicAlignmentScore(Integer strategicAlignmentScore) {
        this.strategicAlignmentScore = strategicAlignmentScore;
    }

    /**
     * @return Integer return the roiScore
     */
    public Integer getRoiScore() {
        return roiScore;
    }

    /**
     * @param roiScore the roiScore to set
     */
    public void setRoiScore(Integer roiScore) {
        this.roiScore = roiScore;
    }

    /**
     * @return Integer return the riskScore
     */
    public Integer getRiskScore() {
        return riskScore;
    }

    /**
     * @param riskScore the riskScore to set
     */
    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    /**
     * @return Integer return the innovationScore
     */
    public Integer getInnovationScore() {
        return innovationScore;
    }

    /**
     * @param innovationScore the innovationScore to set
     */
    public void setInnovationScore(Integer innovationScore) {
        this.innovationScore = innovationScore;
    }

    /**
     * @return Integer return the feasibilityScore
     */
    public Integer getFeasibilityScore() {
        return feasibilityScore;
    }

    /**
     * @param feasibilityScore the feasibilityScore to set
     */
    public void setFeasibilityScore(Integer feasibilityScore) {
        this.feasibilityScore = feasibilityScore;
    }

    /**
     * @return Long return the createdBy
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
    public Double getFinalScore() {
    return finalScore;
}

public void setFinalScore(Double finalScore) {
    this.finalScore = finalScore;
}
@Override
public String toString() {
    return "Project{" +
            "projectId=" + projectId +
            ", portfolioId=" + portfolioId +
            ", projectName='" + projectName + '\'' +
            ", description='" + description + '\'' +
            ", projectType='" + projectType + '\'' +
            ", status='" + status + '\'' +
            ", requestedBudget=" + requestedBudget +
            ", strategicAlignmentScore=" + strategicAlignmentScore +
            ", roiScore=" + roiScore +
            ", riskScore=" + riskScore +
            ", innovationScore=" + innovationScore +
            ", feasibilityScore=" + feasibilityScore +
            ", finalScore=" + finalScore +
            ", createdBy=" + createdBy +
            '}';
}
}