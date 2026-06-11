package de.hftstuttgart.ppm.ui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Hybrid Portfolio Management System");

        setSize(900, 650);

        setLayout(null);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dashboard Title

        JLabel titleLabel =
                new JLabel(
                        "Hybrid Portfolio Management System");

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        titleLabel.setBounds(
                180,
                20,
                600,
                40);

        add(titleLabel);

        // Statistics

        JLabel statsLabel =
                new JLabel(
                        "Projects: 10   |   Portfolios: 1   |   Audit Logs: 6");

        statsLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14));

        statsLabel.setBounds(
                250,
                70,
                400,
                30);

        add(statsLabel);

        // Buttons

        JButton createProjectButton =
                new JButton("Create Project");

        JButton viewProjectsButton =
                new JButton("View Projects");

        JButton submitProjectButton =
                new JButton("Submit Project");

        JButton approveProjectButton =
                new JButton("Approve Project");

        JButton portfolioButton =
                new JButton("View Portfolios");

        JButton auditLogButton =
                new JButton("View Audit Logs");

        JButton reportsButton =
                new JButton("Reports");

        // Row 1

        createProjectButton.setBounds(
                100,
                150,
                250,
                60);

        viewProjectsButton.setBounds(
                500,
                150,
                250,
                60);

        // Row 2

        submitProjectButton.setBounds(
                100,
                250,
                250,
                60);

        approveProjectButton.setBounds(
                500,
                250,
                250,
                60);

        // Row 3

        portfolioButton.setBounds(
                100,
                350,
                250,
                60);

        auditLogButton.setBounds(
                500,
                350,
                250,
                60);

        // Row 4

        reportsButton.setBounds(
                300,
                450,
                250,
                60);

        // Actions

        createProjectButton.addActionListener(
                event -> new CreateProjectFrame());

        viewProjectsButton.addActionListener(
                event -> new ViewProjectsFrame());

        submitProjectButton.addActionListener(
                event -> new SubmitProjectFrame());

        approveProjectButton.addActionListener(
                event -> new ApproveProjectFrame());

        portfolioButton.addActionListener(
                event -> new ViewPortfoliosFrame());

        auditLogButton.addActionListener(
                event -> new AuditLogFrame());

        reportsButton.addActionListener(
                event -> new ReportsFrame());

        // Add Buttons

        add(createProjectButton);

        add(viewProjectsButton);

        add(submitProjectButton);

        add(approveProjectButton);

        add(portfolioButton);

        add(auditLogButton);

        add(reportsButton);

        setVisible(true);
    }
}