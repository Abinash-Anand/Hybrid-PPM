package de.hftstuttgart.ppm.ui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import de.hftstuttgart.ppm.dao.AuditLogDAO;
import de.hftstuttgart.ppm.model.AuditLog;

public class AuditLogFrame extends JFrame {

    public AuditLogFrame() {

        setTitle("Audit Logs");

        setSize(900, 500);

        setLocationRelativeTo(null);

        String[] columns = {
                "Audit ID",
                "User ID",
                "Action",
                "Entity Type",
                "Entity ID",
                "Description",
                "Created At"
        };

        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

        JTable table = new JTable(tableModel);

        AuditLogDAO auditLogDAO = new AuditLogDAO();

        List<AuditLog> auditLogs = auditLogDAO.findAllAuditLogs();

        for (AuditLog auditLog : auditLogs) {

            Object[] row = {

                    auditLog.getAuditId(),

                    auditLog.getUserId(),

                    auditLog.getActionType(),

                    auditLog.getEntityType(),

                    auditLog.getEntityId(),

                    auditLog.getDescription(),

                    auditLog.getCreatedAt()
            };

            tableModel.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);

        setVisible(true);
    }
}