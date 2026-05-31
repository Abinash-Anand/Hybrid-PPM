package de.hftstuttgart.ppm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.hftstuttgart.ppm.database.DBConnectionManager;

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
}