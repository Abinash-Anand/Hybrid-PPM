package de.hftstuttgart.ppm.ui;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import de.hftstuttgart.ppm.dao.ReportDAO;

public class ReportsFrame extends JFrame {

    private JTable table;

    private DefaultTableModel tableModel;

    private JComboBox<String> reportSelector;

    public ReportsFrame() {

        setTitle("Reports");

        setSize(1000, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        setLayout(null);

        String[] reports = {

                "Project Portfolio Mapping",

                "Project Creator Information",

                "User Role Information",

                "Portfolio Ownership Information",

                "Audit Trail Report"
        };

        reportSelector =
                new JComboBox<>(reports);

        reportSelector.setBounds(
                30,
                20,
                300,
                30);

        add(reportSelector);

        JButton loadButton =
                new JButton("Load Report");

        loadButton.setBounds(
                350,
                20,
                150,
                30);

        add(loadButton);

        tableModel =
                new DefaultTableModel();

        table =
                new JTable(tableModel);

        JScrollPane scrollPane =
                new JScrollPane(table);

        scrollPane.setBounds(
                30,
                70,
                920,
                450);

        add(scrollPane);

        loadButton.addActionListener(
                event -> loadSelectedReport());

        setVisible(true);
    }

    private void loadSelectedReport() {

        try {

            ReportDAO reportDAO =
                    new ReportDAO();

            ResultSet resultSet = null;

            String selectedReport =
                    (String) reportSelector.getSelectedItem();

            switch (selectedReport) {

                case "Project Portfolio Mapping":

                    resultSet =
                            reportDAO.getProjectPortfolioReport();

                    break;

                case "Project Creator Information":

                    resultSet =
                            reportDAO.getProjectCreatorReport();

                    break;

                case "User Role Information":

                    resultSet =
                            reportDAO.getUserRoleReport();

                    break;

                case "Portfolio Ownership Information":

                    resultSet =
                            reportDAO.getPortfolioOwnerReport();

                    break;

                case "Audit Trail Report":

                    resultSet =
                            reportDAO.getAuditTrailReport();

                    break;
            }

            populateTable(resultSet);

        } catch (Exception exception) {

            exception.printStackTrace();

            JOptionPane.showMessageDialog(
                    this,
                    "Error loading report.");
        }
    }

    private void populateTable(
            ResultSet resultSet)
            throws Exception {

        tableModel.setRowCount(0);

        tableModel.setColumnCount(0);

        ResultSetMetaData metaData =
                resultSet.getMetaData();

        int columnCount =
                metaData.getColumnCount();

        for (int i = 1;
             i <= columnCount;
             i++) {

            tableModel.addColumn(
                    metaData.getColumnName(i));
        }

        while (resultSet.next()) {

            Object[] row =
                    new Object[columnCount];

            for (int i = 1;
                 i <= columnCount;
                 i++) {

                row[i - 1] =
                        resultSet.getObject(i);
            }

            tableModel.addRow(row);
        }
    }
}