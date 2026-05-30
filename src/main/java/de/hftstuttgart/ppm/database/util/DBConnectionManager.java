package de.hftstuttgart.ppm.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Manages PostgreSQL database connections.
 *
 * Responsibilities:
 * 1. Open database connections
 * 2. Provide JDBC connections to DAOs
 * 3. Safely close database connections
 */
public final class DBConnectionManager {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/hybrid_ppm_db";

    private static final String USER = "ppm_user";

    private static final String PASSWORD = "ppm123";

    /**
     * Private constructor prevents instantiation.
     */
    private DBConnectionManager() {
        throw new IllegalStateException(
                "Utility class should not be instantiated."
        );
    }

    /**
     * Creates and returns a new database connection.
     *
     * @return JDBC Connection
     * @throws SQLException if connection cannot be established
     */
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }

    /**
     * Safely closes a database connection.
     *
     * @param connection database connection
     */
    public static void closeConnection(Connection connection) {

        if (connection != null) {

            try {

                connection.close();

            } catch (SQLException exception) {

                System.err.println(
                        "Failed to close database connection."
                );

                exception.printStackTrace();
            }
        }
    }
}