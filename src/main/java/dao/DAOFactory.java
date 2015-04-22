package dao;


import dao.impl.AuthorDAOImpl;
import dao.impl.BookDAOImpl;
import dao.impl.UserDAOImpl;

public class DAOFactory {

    private static UserDAO userDAO = null;
    private static AuthorDAO authorDAO = null;
    private static BookDAO bookDAO = null;
    private static DAOFactory instance = null;

    private DAOFactory() {
    }

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

    public AuthorDAO getAuthorDAO() {
        if (authorDAO == null) {
            authorDAO = new AuthorDAOImpl();
        }
        return authorDAO;
    }

    public BookDAO getBookDAO() {
        if (bookDAO == null) {
            bookDAO = new BookDAOImpl();
        }
        return bookDAO;
    }

}