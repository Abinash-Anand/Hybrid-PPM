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

 
    public Long getProjectId() {
        return projectId;
    }


    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }


    public Long getPortfolioId() {
        return portfolioId;
    }


    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

 
    public String getProjectName() {
        return projectName;
    }


    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getProjectType() {
        return projectType;
    }


    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public BigDecimal getRequestedBudget() {
        return requestedBudget;
    }


    public void setRequestedBudget(BigDecimal requestedBudget) {
        this.requestedBudget = requestedBudget;
    }

 
    public Integer getStrategicAlignmentScore() {
        return strategicAlignmentScore;
    }

 
    public void setStrategicAlignmentScore(Integer strategicAlignmentScore) {
        this.strategicAlignmentScore = strategicAlignmentScore;
    }


    public Integer getRoiScore() {
        return roiScore;
    }


    public void setRoiScore(Integer roiScore) {
        this.roiScore = roiScore;
    }


    public Integer getRiskScore() {
        return riskScore;
    }


    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }


    public Integer getInnovationScore() {
        return innovationScore;
    }


    public void setInnovationScore(Integer innovationScore) {
        this.innovationScore = innovationScore;
    }


    public Integer getFeasibilityScore() {
        return feasibilityScore;
    }


    public void setFeasibilityScore(Integer feasibilityScore) {
        this.feasibilityScore = feasibilityScore;
    }


    public Long getCreatedBy() {
        return createdBy;
    }

 
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