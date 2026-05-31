package de.hftstuttgart.ppm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.hftstuttgart.ppm.database.DBConnectionManager;
import de.hftstuttgart.ppm.model.User;

public class UserDAO {
public List<User> findAllUsers() {

    List<User> users = new ArrayList<>();

    String sql = "SELECT * FROM users";

    try (
            Connection connection =
                    DBConnectionManager.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            ResultSet resultSet =
                    statement.executeQuery()
    ) {

        while (resultSet.next()) {

            User user = new User();

            user.setUserId(
                    resultSet.getLong("user_id"));

            user.setFirstName(
                    resultSet.getString("first_name"));

            user.setLastName(
                    resultSet.getString("last_name"));

            user.setEmail(
                    resultSet.getString("email"));

            user.setPasswordHash(
                    resultSet.getString("password_hash"));

            user.setRoleId(
                    resultSet.getLong("role_id"));

            users.add(user);
        }

    } catch (SQLException exception) {

        exception.printStackTrace();
    }

    return users;
}

public User findUserById(Long userId) {

    String sql =
            "SELECT * FROM users WHERE user_id = ?";

    try (
            Connection connection =
                    DBConnectionManager.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql)
    ) {

        statement.setLong(1, userId);

        ResultSet resultSet =
                statement.executeQuery();

        if (resultSet.next()) {

            User user = new User();

            user.setUserId(
                    resultSet.getLong("user_id"));

            user.setFirstName(
                    resultSet.getString("first_name"));

            user.setLastName(
                    resultSet.getString("last_name"));

            user.setEmail(
                    resultSet.getString("email"));

            user.setPasswordHash(
                    resultSet.getString("password_hash"));

            user.setRoleId(
                    resultSet.getLong("role_id"));

            return user;
        }

    } catch (SQLException exception) {

        exception.printStackTrace();
    }

    return null;
}

public void createUser(User user) {

    String sql =
            "INSERT INTO users " +
            "(first_name, last_name, email, password_hash, role_id) " +
            "VALUES (?, ?, ?, ?, ?)";

    try (
            Connection connection =
                    DBConnectionManager.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql)
    ) {

        statement.setString(
                1,
                user.getFirstName());

        statement.setString(
                2,
                user.getLastName());

        statement.setString(
                3,
                user.getEmail());

        statement.setString(
                4,
                user.getPasswordHash());

        statement.setLong(
                5,
                user.getRoleId());

        int rowsAffected =
                statement.executeUpdate();

        System.out.println(
                rowsAffected + " user inserted.");

    } catch (SQLException exception) {

        exception.printStackTrace();
    }
}

public void deleteUser(Long userId) {

    String sql =
            "DELETE FROM users WHERE user_id = ?";

    try (
            Connection connection =
                    DBConnectionManager.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql)
    ) {

        statement.setLong(1, userId);

        int rowsAffected =
                statement.executeUpdate();

        System.out.println(
                rowsAffected + " user deleted.");

    } catch (SQLException exception) {

        exception.printStackTrace();
    }
}
}
