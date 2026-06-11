package de.hftstuttgart.ppm.model;

import java.math.BigDecimal;

public class Portfolio {

    private Long portfolioId;

    private String portfolioName;

    private String description;

    private BigDecimal budget;

    private String status;

    private Long createdBy;


    public Long getPortfolioId() {
        return portfolioId;
    }


    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }


    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public BigDecimal getBudget() {
        return budget;
    }


    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Long getCreatedBy() {
        return createdBy;
    }


    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
}