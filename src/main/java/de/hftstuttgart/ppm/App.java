package de.hftstuttgart.ppm;

import java.util.List;

import de.hftstuttgart.ppm.dao.UserDAO;
import de.hftstuttgart.ppm.model.User;

public class App {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();

        List<User> users =
                userDAO.findAllUsers();

        for (User user : users) {

            System.out.println(user);
        }
    }
    
}