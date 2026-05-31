package de.hftstuttgart.ppm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnectionManager {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/hybrid_ppm_db";

    private static final String USER =
            "ppm_user";

    private static final String PASSWORD =
            "hybridppm";

    private DBConnectionManager() {
    }

    public static Connection getConnection()
            throws SQLException {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}