package dao;

import models.Author;

import java.sql.SQLException;
import java.util.List;

public interface AuthorDAO {
    void addAuthor(Author author) throws SQLException;
    void updateAuthor (Author author) throws SQLException;
    Author getAuthorById(Long id) throws SQLException;
    List<Author> getAllAuthors() throws SQLException;
    void deleteAuthor(Author author) throws SQLException;
}
