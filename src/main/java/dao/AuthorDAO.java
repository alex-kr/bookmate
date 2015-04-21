package dao;

import models.Author;

import java.sql.SQLException;
import java.util.Collection;

public interface AuthorDAO {
    public void addAuthor(Author author) throws SQLException;
    public void updateAuthor (Long id, Author author) throws SQLException;
    public Author getAuthorById(Long id) throws SQLException;
    public Collection getAllAuthors() throws SQLException;
    public void deleteAuthor(Author author) throws SQLException;
}
