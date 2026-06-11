package de.hftstuttgart.ppm.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import de.hftstuttgart.ppm.dao.ProjectDAO;

public class SubmitProjectFrame extends JFrame {

    private JTextField projectIdField;

    public SubmitProjectFrame() {

        setTitle("Submit Project");

        setSize(400, 250);

        setLayout(null);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        JLabel projectIdLabel =
                new JLabel("Project ID:");

        projectIdLabel.setBounds(
                30,
                40,
                100,
                30);

        add(projectIdLabel);

        projectIdField =
                new JTextField();

        projectIdField.setBounds(
                130,
                40,
                150,
                30);

        add(projectIdField);

        JButton submitButton =
                new JButton("Submit");

        submitButton.setBounds(
                130,
                100,
                150,
                40);

        add(submitButton);

        submitButton.addActionListener(event -> {

            try {

                Long projectId =
                        Long.parseLong(
                                projectIdField.getText());

                ProjectDAO projectDAO =
                        new ProjectDAO();

                boolean success =
                        projectDAO.submitProject(
                                projectId);

                if (success) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Project submitted successfully.");

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Project must be in DRAFT status.");
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