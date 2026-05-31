package de.hftstuttgart.ppm.services;


import de.hftstuttgart.ppm.model.Project;

public class ApprovalService {

    public void submitProject(Project project) {

        project.setStatus("SUBMITTED");
    }

    public void approveProject(Project project) {

        project.setStatus("APPROVED");
    }

    public void rejectProject(Project project) {

        project.setStatus("REJECTED");
    }
}