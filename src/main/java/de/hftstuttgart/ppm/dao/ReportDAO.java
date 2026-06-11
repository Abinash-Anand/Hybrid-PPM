package de.hftstuttgart.ppm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hftstuttgart.ppm.database.DBConnectionManager;

public class ReportDAO {

    public ResultSet getProjectPortfolioReport()
            throws SQLException {

        String sql =
                "SELECT " +
                "p.project_id, " +
                "p.project_name, " +
                "p.status, " +
                "pf.portfolio_name " +
                "FROM projects p " +
                "JOIN portfolios pf " +
                "ON p.portfolio_id = pf.portfolio_id " +
                "ORDER BY p.project_id";

        Connection connection =
                DBConnectionManager.getConnection();

        PreparedStatement statement =
                connection.prepareStatement(sql);

        return statement.executeQuery();
    }

    public ResultSet getProjectCreatorReport()
            throws SQLException {

        String sql =
                "SELECT " +
                "p.project_name, " +
                "p.status, " +
                "u.first_name, " +
                "u.last_name " +
                "FROM projects p " +
                "JOIN users u " +
                "ON p.created_by = u.user_id " +
                "ORDER BY p.project_id";

        Connection connection =
                DBConnectionManager.getConnection();

        PreparedStatement statement =
                connection.prepareStatement(sql);

        return statement.executeQuery();
    }

    public ResultSet getUserRoleReport()
            throws SQLException {

        String sql =
                "SELECT " +
                "u.first_name, " +
                "u.last_name, " +
                "r.role_name " +
                "FROM users u " +
                "JOIN roles r " +
                "ON u.role_id = r.role_id";

        Connection connection =
                DBConnectionManager.getConnection();

        PreparedStatement statement =
                connection.prepareStatement(sql);

        return statement.executeQuery();
    }

    public ResultSet getPortfolioOwnerReport()
            throws SQLException {

        String sql =
                "SELECT " +
                "p.portfolio_name, " +
                "u.first_name, " +
                "u.last_name, " +
                "r.role_name " +
                "FROM portfolios p " +
                "JOIN users u " +
                "ON p.created_by = u.user_id " +
                "JOIN roles r " +
                "ON u.role_id = r.role_id";

        Connection connection =
                DBConnectionManager.getConnection();

        PreparedStatement statement =
                connection.prepareStatement(sql);

        return statement.executeQuery();
    }

    public ResultSet getAuditTrailReport()
            throws SQLException {

        String sql =
                "SELECT " +
                "a.audit_id, " +
                "a.action_type, " +
                "p.project_name, " +
                "a.description, " +
                "a.created_at " +
                "FROM audit_logs a " +
                "JOIN projects p " +
                "ON a.entity_id = p.project_id " +
                "ORDER BY a.audit_id DESC";

        Connection connection =
                DBConnectionManager.getConnection();

        PreparedStatement statement =
                connection.prepareStatement(sql);

        return statement.executeQuery();
    }
}