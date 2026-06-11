package de.hftstuttgart.ppm.ui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import de.hftstuttgart.ppm.dao.ProjectDAO;
import de.hftstuttgart.ppm.model.Project;

public class ViewProjectsFrame extends JFrame {

    public ViewProjectsFrame() {

        setTitle("View Projects");

        setSize(1000, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Project ID",
                "Project Name",
                "Project Type",
                "Budget",
                "Final Score",
                "Status",
                "Created By"
        };

        DefaultTableModel tableModel =
                new DefaultTableModel(columns, 0);

        JTable table =
                new JTable(tableModel);

        table.setAutoResizeMode(
                JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setRowHeight(25);

        ProjectDAO projectDAO =
                new ProjectDAO();

        List<Project> projects =
                projectDAO.findAllProjects();

        for (Project project : projects) {

            Object[] row = {

                    project.getProjectId(),

                    project.getProjectName(),

                    project.getProjectType(),

                    project.getRequestedBudget(),

                    project.getFinalScore(),

                    project.getStatus(),

                    project.getCreatedBy()
            };

            tableModel.addRow(row);
        }

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        setVisible(true);
    }
}