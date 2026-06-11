package de.hftstuttgart.ppm.ui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import de.hftstuttgart.ppm.dao.PortfolioDAO;
import de.hftstuttgart.ppm.model.Portfolio;

public class ViewPortfoliosFrame extends JFrame {

    public ViewPortfoliosFrame() {

        setTitle("View Portfolios");

        setSize(900, 500);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Portfolio ID",
                "Portfolio Name",
                "Budget",
                "Status",
                "Created By"
        };

        DefaultTableModel tableModel =
                new DefaultTableModel(columns, 0);

        JTable table =
                new JTable(tableModel);

        PortfolioDAO portfolioDAO =
                new PortfolioDAO();

        List<Portfolio> portfolios =
                portfolioDAO.findAllPortfolios();

        for (Portfolio portfolio : portfolios) {

            Object[] row = {

                    portfolio.getPortfolioId(),

                    portfolio.getPortfolioName(),

                    portfolio.getBudget(),

                    portfolio.getStatus(),

                    portfolio.getCreatedBy()
            };

            tableModel.addRow(row);
        }

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        setVisible(true);
    }
}