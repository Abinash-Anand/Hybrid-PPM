package de.hftstuttgart.ppm.services;

import de.hftstuttgart.ppm.model.Project;

public class ProjectScoringService {

    private static final double STRATEGIC_ALIGNMENT_WEIGHT = 0.30;

    private static final double ROI_WEIGHT = 0.25;

    private static final double RISK_WEIGHT = 0.15;

    private static final double INNOVATION_WEIGHT = 0.20;

    private static final double FEASIBILITY_WEIGHT = 0.10;

    public double calculateFinalScore(Project project) {

double score =
        project.getStrategicAlignmentScore() * 0.30
        + project.getRoiScore() * 0.25
        + project.getRiskScore() * 0.15
        + project.getInnovationScore() * 0.20
        + project.getFeasibilityScore() * 0.10;

return Math.round(score * 100.0) / 100.0;
    }
}