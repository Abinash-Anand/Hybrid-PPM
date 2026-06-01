package de.hftstuttgart.ppm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.hftstuttgart.ppm.database.DBConnectionManager;
import de.hftstuttgart.ppm.model.Project;

public class ProjectDAO {
        public List<Project> findAllProjects() {

                List<Project> projects = new ArrayList<>();

                String sql = "SELECT * FROM projects";

                try (
                                Connection connection = DBConnectionManager.getConnection();

                                PreparedStatement statement = connection.prepareStatement(sql);

                                ResultSet resultSet = statement.executeQuery()) {

                        while (resultSet.next()) {

                                Project project = new Project();

                                project.setProjectId(
                                                resultSet.getLong("project_id"));

                                project.setPortfolioId(
                                                resultSet.getLong("portfolio_id"));

                                project.setProjectName(
                                                resultSet.getString("project_name"));

                                project.setDescription(
                                                resultSet.getString("description"));

                                project.setProjectType(
                                                resultSet.getString("project_type"));

                                project.setStatus(
                                                resultSet.getString("status"));

                                project.setRequestedBudget(
                                                resultSet.getBigDecimal("requested_budget"));

                                project.setStrategicAlignmentScore(
                                                resultSet.getInt("strategic_alignment_score"));

                                project.setRoiScore(
                                                resultSet.getInt("roi_score"));

                                project.setRiskScore(
                                                resultSet.getInt("risk_score"));

                                project.setInnovationScore(
                                                resultSet.getInt("innovation_score"));

                                project.setFeasibilityScore(
                                                resultSet.getInt("feasibility_score"));

                                project.setFinalScore(
                                                resultSet.getDouble("final_score"));

                                project.setCreatedBy(
                                                resultSet.getLong("created_by"));

                                projects.add(project);
                        }

                } catch (SQLException exception) {

                        exception.printStackTrace();
                }

                return projects;
        }

        public Project findProjectById(Long projectId) {

                String sql = "SELECT * FROM projects WHERE project_id = ?";

                try (
                                Connection connection = DBConnectionManager.getConnection();

                                PreparedStatement statement = connection.prepareStatement(sql)) {

                        statement.setLong(1, projectId);

                        ResultSet resultSet = statement.executeQuery();

                        if (resultSet.next()) {

                                Project project = new Project();

                                project.setProjectId(
                                                resultSet.getLong("project_id"));

                                project.setPortfolioId(
                                                resultSet.getLong("portfolio_id"));

                                project.setProjectName(
                                                resultSet.getString("project_name"));

                                project.setDescription(
                                                resultSet.getString("description"));

                                project.setProjectType(
                                                resultSet.getString("project_type"));

                                project.setStatus(
                                                resultSet.getString("status"));

                                project.setRequestedBudget(
                                                resultSet.getBigDecimal("requested_budget"));

                                project.setStrategicAlignmentScore(
                                                resultSet.getInt("strategic_alignment_score"));

                                project.setRoiScore(
                                                resultSet.getInt("roi_score"));

                                project.setRiskScore(
                                                resultSet.getInt("risk_score"));

                                project.setInnovationScore(
                                                resultSet.getInt("innovation_score"));

                                project.setFeasibilityScore(
                                                resultSet.getInt("feasibility_score"));

                                project.setFinalScore(
                                                resultSet.getDouble("final_score"));

                                project.setCreatedBy(
                                                resultSet.getLong("created_by"));

                                return project;
                        }

                } catch (SQLException exception) {

                        exception.printStackTrace();
                }

                return null;
        }

        public void createProject(Project project) {

                String sql = "INSERT INTO projects (" +
                                "portfolio_id, " +
                                "project_name, " +
                                "description, " +
                                "project_type, " +
                                "status, " +
                                "requested_budget, " +
                                "strategic_alignment_score, " +
                                "roi_score, " +
                                "risk_score, " +
                                "innovation_score, " +
                                "feasibility_score, " +
                                "final_score, " +
                                "created_by" +
                                ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (
                                Connection connection = DBConnectionManager.getConnection();

                                PreparedStatement statement = connection.prepareStatement(sql)) {

                        statement.setLong(
                                        1,
                                        project.getPortfolioId());

                        statement.setString(
                                        2,
                                        project.getProjectName());

                        statement.setString(
                                        3,
                                        project.getDescription());

                        statement.setString(
                                        4,
                                        project.getProjectType());

                        statement.setString(
                                        5,
                                        project.getStatus());

                        statement.setBigDecimal(
                                        6,
                                        project.getRequestedBudget());

                        statement.setInt(
                                        7,
                                        project.getStrategicAlignmentScore());

                        statement.setInt(
                                        8,
                                        project.getRoiScore());

                        statement.setInt(
                                        9,
                                        project.getRiskScore());

                        statement.setInt(
                                        10,
                                        project.getInnovationScore());

                        statement.setInt(
                                        11,
                                        project.getFeasibilityScore());

                        statement.setDouble(
                                        12,
                                        project.getFinalScore());

                        statement.setLong(
                                        13,
                                        project.getCreatedBy());

                        int rowsAffected = statement.executeUpdate();

                        System.out.println(
                                        rowsAffected + " project inserted.");

                } catch (SQLException exception) {

                        exception.printStackTrace();
                }

        }

        public boolean updateProjectStatus(
                        Long projectId,
                        String status) {

                String sql = "UPDATE projects " +
                                "SET status = ? " +
                                "WHERE project_id = ?";

                try (

                                Connection connection = DBConnectionManager.getConnection();

                                PreparedStatement statement = connection.prepareStatement(sql)

                ) {

                        statement.setString(
                                        1,
                                        status);

                        statement.setLong(
                                        2,
                                        projectId);

                        int rowsAffected = statement.executeUpdate();

                        return rowsAffected > 0;

                } catch (SQLException exception) {

                        exception.printStackTrace();

                        return false;
                }
                
        }
}