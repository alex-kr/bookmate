package dao;

import models.Book;

import java.sql.SQLException;
import java.util.Collection;

public interface BookDAO {
    public void addBook(Book book) throws SQLException;
    public void updateBook (Long id, Book book) throws SQLException;
    public Book getBookById(Long id) throws SQLException;
    public Collection getBooksByAuthorId(Long authorId) throws SQLException;
    public Collection getAllBooks() throws SQLException;
    public void deleteBook(Book book) throws SQLException;
}
