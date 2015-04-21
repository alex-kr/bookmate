package dao;

import models.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    void addBook(Book book) throws SQLException;
    void updateBook (Book book) throws SQLException;
    Book getBookById(Long id) throws SQLException;
    List<Book> getBooksByAuthorId(Long authorId) throws SQLException;
    List<Book> getAllBooks() throws SQLException;
    void deleteBook(Book book) throws SQLException;
}
