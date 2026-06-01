package de.hftstuttgart.ppm.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import de.hftstuttgart.ppm.dao.ProjectDAO;
import de.hftstuttgart.ppm.model.Project;
import de.hftstuttgart.ppm.services.ProjectScoringService;

public class CreateProjectFrame extends JFrame {
        private JLabel scoreLabel;
        private Double calculatedScore;
        private JTextField nameField;

        private JTextField budgetField;

        private JTextField strategicField;

        private JTextField roiField;

        private JTextField riskField;

        private JTextField innovationField;

        private JTextField feasibilityField;

        public CreateProjectFrame() {

                setTitle("Create Project");

                setSize(600, 700);

                setLayout(null);

                setLocationRelativeTo(null);

                // Project Name
                JLabel nameLabel = new JLabel("Project Name:");
                nameLabel.setBounds(30, 30, 120, 30);
                add(nameLabel);

                nameField = new JTextField();
                nameField.setBounds(150, 30, 250, 30);
                add(nameField);

                // Budget
                JLabel budgetLabel = new JLabel("Budget:");
                budgetLabel.setBounds(30, 80, 120, 30);
                add(budgetLabel);

                budgetField = new JTextField();
                budgetField.setBounds(150, 80, 250, 30);
                add(budgetField);

                // Strategic Alignment
                JLabel strategicLabel = new JLabel("Strategic Alignment:");
                strategicLabel.setBounds(30, 130, 120, 30);
                add(strategicLabel);

                strategicField = new JTextField();
                strategicField.setBounds(150, 130, 250, 30);
                add(strategicField);

                // ROI
                JLabel roiLabel = new JLabel("ROI:");
                roiLabel.setBounds(30, 180, 120, 30);
                add(roiLabel);

                roiField = new JTextField();
                roiField.setBounds(150, 180, 250, 30);
                add(roiField);

                // Risk
                JLabel riskLabel = new JLabel("Risk:");
                riskLabel.setBounds(30, 230, 120, 30);
                add(riskLabel);

                riskField = new JTextField();
                riskField.setBounds(150, 230, 250, 30);
                add(riskField);

                // Innovation
                JLabel innovationLabel = new JLabel("Innovation:");
                innovationLabel.setBounds(30, 280, 120, 30);
                add(innovationLabel);

                innovationField = new JTextField();
                innovationField.setBounds(150, 280, 250, 30);
                add(innovationField);

                // Feasibility
                JLabel feasibilityLabel = new JLabel("Feasibility:");
                feasibilityLabel.setBounds(30, 330, 120, 30);
                add(feasibilityLabel);

                feasibilityField = new JTextField();
                feasibilityField.setBounds(150, 330, 250, 30);
                add(feasibilityField);

                // Calculate Button
                JButton calculateButton = new JButton("Calculate Score");
                scoreLabel = new JLabel("Final Score: ");
                JButton saveButton = new JButton("Save Project");

                saveButton.setBounds(
                                150,
                                530,
                                180,
                                40);

                add(saveButton);
                scoreLabel.setBounds(
                                150,
                                480,
                                250,
                                30);

                add(scoreLabel);
                calculateButton.setBounds(
                                150,
                                420,
                                180,
                                40);
                saveButton.addActionListener(event -> {

                        try {

                                Project project = new Project();

                                project.setPortfolioId(1L);

                                project.setProjectName(
                                                nameField.getText());

                                project.setProjectType(
                                                "INNOVATION");

                                project.setStatus(
                                                "DRAFT");

                                project.setRequestedBudget(
                                                new java.math.BigDecimal(
                                                                budgetField.getText()));

                                project.setStrategicAlignmentScore(
                                                Integer.parseInt(
                                                                strategicField.getText()));

                                project.setRoiScore(
                                                Integer.parseInt(
                                                                roiField.getText()));

                                project.setRiskScore(
                                                Integer.parseInt(
                                                                riskField.getText()));

                                project.setInnovationScore(
                                                Integer.parseInt(
                                                                innovationField.getText()));

                                project.setFeasibilityScore(
                                                Integer.parseInt(
                                                                feasibilityField.getText()));

                                project.setFinalScore(
                                                calculatedScore);

                                project.setCreatedBy(3L);

                                ProjectDAO projectDAO = new ProjectDAO();

                                projectDAO.createProject(project);

                                JOptionPane.showMessageDialog(
                                                this,
                                                "Project saved successfully.");

                        } catch (Exception exception) {

                                JOptionPane.showMessageDialog(
                                                this,
                                                "Error saving project.");
                        }
                });
                calculateButton.addActionListener(event -> {

                        try {

                                Project project = new Project();

                                project.setStrategicAlignmentScore(
                                                Integer.parseInt(
                                                                strategicField.getText()));

                                project.setRoiScore(
                                                Integer.parseInt(
                                                                roiField.getText()));

                                project.setRiskScore(
                                                Integer.parseInt(
                                                                riskField.getText()));

                                project.setInnovationScore(
                                                Integer.parseInt(
                                                                innovationField.getText()));

                                project.setFeasibilityScore(
                                                Integer.parseInt(
                                                                feasibilityField.getText()));

                                ProjectScoringService scoringService = new ProjectScoringService();

                                double score = scoringService.calculateFinalScore(project);

                                scoreLabel.setText(
                                                "Final Score: " + score);
                                calculatedScore = score;
                        } catch (Exception exception) {

                                JOptionPane.showMessageDialog(
                                                this,
                                                "Please enter valid numbers.");
                        }
                });

                add(calculateButton);

                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                setVisible(true);
        }
}