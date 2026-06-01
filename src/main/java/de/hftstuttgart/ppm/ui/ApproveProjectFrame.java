package de.hftstuttgart.ppm.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import de.hftstuttgart.ppm.dao.ProjectDAO;
import de.hftstuttgart.ppm.model.Project;
import de.hftstuttgart.ppm.services.AuditLogService;

public class ApproveProjectFrame extends JFrame {

    private JTextField projectIdField;

    public ApproveProjectFrame() {

        setTitle("Approve Project");

        setSize(400, 250);

        setLayout(null);

        setLocationRelativeTo(null);

        JLabel projectIdLabel = new JLabel("Project ID:");

        projectIdLabel.setBounds(
                30,
                40,
                100,
                30);

        add(projectIdLabel);

        projectIdField = new JTextField();

        projectIdField.setBounds(
                130,
                40,
                150,
                30);

        add(projectIdField);

        JButton approveButton = new JButton("Approve");

        approveButton.setBounds(
                130,
                100,
                150,
                40);

        add(approveButton);

        approveButton.addActionListener(event -> {

            try {

                Long projectId = Long.parseLong(
                        projectIdField.getText());

                ProjectDAO projectDAO = new ProjectDAO();

                Project project = projectDAO.findProjectById(
                        projectId);

                if (project == null) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Project not found.");

                    return;
                }

                project.setStatus(
                        "APPROVED");

                AuditLogService auditLogService = new AuditLogService();
                boolean success = projectDAO.updateProjectStatus(
                        projectId,
                        "APPROVED");

                if (success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Project approved.");

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Approval failed.");
                }

            } catch (Exception exception) {

                exception.printStackTrace();

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Project ID.");
            }
        });

        setVisible(true);
    }
}