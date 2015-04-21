package dao;

import models.User;

import java.sql.SQLException;
import java.util.Collection;

public interface UserDAO {
    public void addUser(User user) throws SQLException;
    public void updateUser(Long id, User user) throws SQLException;
    public User getUserById(Long id) throws SQLException;
    public User getUserByName(String name) throws SQLException;
    public Collection getAllUsers() throws SQLException;
    public void deleteUser(User user) throws SQLException;
}
