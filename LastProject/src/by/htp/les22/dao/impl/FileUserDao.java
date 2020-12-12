package by.htp.les22.dao.impl;

import by.htp.les22.dao.UserDao;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileUserDao implements UserDao {


    @Override
    public boolean authorization(String login, String password) throws DaoException {
        FileReader reader;
        String filePath = "E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\users.txt";
        try {
            reader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new DaoException(e);
        }
        return false;
    }
}
