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

        setSize(800, 500);

        setLocationRelativeTo(null);

        String[] columns = {
                "Project ID",
                "Project Name",
                "Score",
                "Status"
        };

        DefaultTableModel tableModel =
                new DefaultTableModel(columns, 0);

        JTable table =
                new JTable(tableModel);

        ProjectDAO projectDAO =
                new ProjectDAO();

        List<Project> projects =
                projectDAO.findAllProjects();

        for (Project project : projects) {

            Object[] row = {

                    project.getProjectId(),

                    project.getProjectName(),

                    project.getFinalScore(),

                    project.getStatus()
            };

            tableModel.addRow(row);
        }

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        setVisible(true);
    }
}