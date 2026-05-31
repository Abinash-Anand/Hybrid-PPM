package de.hftstuttgart.ppm.services;

import java.util.Comparator;
import java.util.List;

import de.hftstuttgart.ppm.model.Project;

public class ProjectRankingService {

    public void rankProjects(List<Project> projects) {

        projects.sort(
                Comparator.comparing(
                        Project::getFinalScore)
                        .reversed()
        );
    }
}