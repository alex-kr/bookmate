package dao.impl;

import dao.BookDAO;
import models.Book;

import java.sql.SQLException;
import java.util.Collection;

public class BookDAOImpl implements BookDAO {
    @Override
    public void addBook(Book book) throws SQLException {

    }

    @Override
    public void updateBook(Long id, Book book) throws SQLException {

    }

    @Override
    public Book getBookById(Long id) throws SQLException {
        return null;
    }

    @Override
    public Collection getBooksByAuthorId(Long authorId) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllBooks() throws SQLException {
        return null;
    }

    @Override
    public void deleteBook(Book book) throws SQLException {

    }
}
