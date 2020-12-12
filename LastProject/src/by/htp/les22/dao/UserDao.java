package by.htp.les22.dao;

import by.htp.les22.dao.impl.DaoException;

public interface UserDao {

    boolean authorization(String login, String password) throws DaoException;
}
