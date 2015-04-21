package dao.impl;

import dao.UserDAO;
import models.User;

import java.sql.SQLException;
import java.util.Collection;

public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser(User user) throws SQLException {

    }

    @Override
    public void updateUser(Long id, User user) throws SQLException {

    }

    @Override
    public User getUserById(Long id) throws SQLException {
        return null;
    }

    @Override
    public User getUserByName(String name) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllUsers() throws SQLException {
        return null;
    }

    @Override
    public void deleteUser(User user) throws SQLException {

    }
}
