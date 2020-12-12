package by.htp.les22.service;

import by.htp.les22.service.impl.ServiceException;
import by.htp.les22.service.impl.ValidateException;

public interface UserService {
    boolean logination(String login, String password) throws ServiceException, ValidateException;

}
