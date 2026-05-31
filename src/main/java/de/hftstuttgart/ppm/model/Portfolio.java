package de.hftstuttgart.ppm.model;

import java.math.BigDecimal;

public class Portfolio {

    private Long portfolioId;

    private String portfolioName;

    private String description;

    private BigDecimal budget;

    private String status;

    private Long createdBy;

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
     * @return String return the portfolioName
     */
    public String getPortfolioName() {
        return portfolioName;
    }

    /**
     * @param portfolioName the portfolioName to set
     */
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
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
     * @return BigDecimal return the budget
     */
    public BigDecimal getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(BigDecimal budget) {
        this.budget = budget;
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

}