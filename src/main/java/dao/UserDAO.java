package dao;

import models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void addUser(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
    User getUserById(Long id) throws SQLException;
    User getUserByNickname(String name) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    void deleteUser(User user) throws SQLException;
}
