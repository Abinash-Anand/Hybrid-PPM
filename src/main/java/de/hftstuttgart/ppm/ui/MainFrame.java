package de.hftstuttgart.ppm.ui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

        public MainFrame() {

                setTitle("Hybrid Portfolio Management System");

                setSize(800, 600);

                setLayout(null);

                setLocationRelativeTo(null);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton createProjectButton = new JButton("Create Project");

                createProjectButton.setBounds(
                                50,
                                50,
                                200,
                                40);
                JButton viewProjectsButton = new JButton("View Projects");
                JButton approveProjectButton = new JButton("Approve Project");
                JButton auditLogButton = new JButton("View Audit Logs");
                viewProjectsButton.setBounds(
                                50,
                                120,
                                200,
                                40);
                approveProjectButton.setBounds(
                                50,
                                190,
                                200,
                                40);
                auditLogButton.setBounds(
                                50,
                                260,
                                200,
                                40);
                createProjectButton.addActionListener(
                                event -> new CreateProjectFrame());
                viewProjectsButton.addActionListener(
                                event -> new ViewProjectsFrame());
                approveProjectButton.addActionListener(
                                event -> new ApproveProjectFrame());
                auditLogButton.addActionListener(
                                event -> new AuditLogFrame());
                add(createProjectButton);
                add(viewProjectsButton);
                add(approveProjectButton);
                add(auditLogButton);
                setVisible(true);
        }
}