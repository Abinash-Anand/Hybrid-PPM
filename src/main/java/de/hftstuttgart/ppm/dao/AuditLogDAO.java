package de.hftstuttgart.ppm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.hftstuttgart.ppm.database.DBConnectionManager;
import de.hftstuttgart.ppm.model.AuditLog;

public class AuditLogDAO {

    public void createAuditLog(
            Long userId,
            String actionType,
            String entityType,
            Long entityId,
            String description) {

        String sql =
                "INSERT INTO audit_logs " +
                "(user_id, action_type, entity_type, entity_id, description) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (
                Connection connection =
                        DBConnectionManager.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {

            statement.setLong(1, userId);

            statement.setString(2, actionType);

            statement.setString(3, entityType);

            statement.setLong(4, entityId);

            statement.setString(5, description);

            int rowsAffected =
                    statement.executeUpdate();

            System.out.println(
                    rowsAffected + " audit log inserted.");

        } catch (SQLException exception) {

            exception.printStackTrace();
        }
        
    }
    public List<AuditLog> findAllAuditLogs() {

    List<AuditLog> auditLogs =
            new ArrayList<>();

    String sql =
            "SELECT * " +
            "FROM audit_logs " +
            "ORDER BY audit_id DESC";

    try (

            Connection connection =
                    DBConnectionManager.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            ResultSet resultSet =
                    statement.executeQuery()

    ) {

        while (resultSet.next()) {

            AuditLog auditLog =
                    new AuditLog();

            auditLog.setAuditId(
                    resultSet.getLong("audit_id"));

            auditLog.setUserId(
                    resultSet.getLong("user_id"));

            auditLog.setActionType(
                    resultSet.getString("action_type"));

            auditLog.setEntityType(
                    resultSet.getString("entity_type"));

            auditLog.setEntityId(
                    resultSet.getLong("entity_id"));

            auditLog.setDescription(
                    resultSet.getString("description"));

            auditLog.setCreatedAt(
                    resultSet.getString("created_at"));

            auditLogs.add(auditLog);
        }

    } catch (SQLException exception) {

        exception.printStackTrace();
    }

    return auditLogs;
}
}