package de.hftstuttgart.ppm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.hftstuttgart.ppm.database.DBConnectionManager;
import de.hftstuttgart.ppm.model.Portfolio;

public class PortfolioDAO {

    public List<Portfolio> findAllPortfolios() {

        List<Portfolio> portfolios =
                new ArrayList<>();

        String sql =
                "SELECT * FROM portfolios";

        try (

                Connection connection =
                        DBConnectionManager.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql);

                ResultSet resultSet =
                        statement.executeQuery()

        ) {

            while (resultSet.next()) {

                Portfolio portfolio =
                        new Portfolio();

                portfolio.setPortfolioId(
                        resultSet.getLong("portfolio_id"));

                portfolio.setPortfolioName(
                        resultSet.getString("portfolio_name"));

                portfolio.setDescription(
                        resultSet.getString("description"));

                portfolio.setBudget(
                        resultSet.getBigDecimal("budget"));

                portfolio.setStatus(
                        resultSet.getString("status"));

                portfolio.setCreatedBy(
                        resultSet.getLong("created_by"));

                portfolios.add(portfolio);
            }

        } catch (SQLException exception) {

            exception.printStackTrace();
        }

        return portfolios;
    }
}