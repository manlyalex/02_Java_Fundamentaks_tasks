package by.htp.les22.dao;

import by.htp.les22.dao.impl.FileApplianceDao;
import by.htp.les22.dao.impl.FileUserDao;

public class DaoProvider {

    private static final DaoProvider instance = new DaoProvider();

    private UserDao userDao = new FileUserDao();
    private ApplianceDao applianceDao = new FileApplianceDao();

    public UserDao getUserDao() {
        return userDao;
    }

    public ApplianceDao getApplianceDao() {
        return applianceDao;
    }

    private DaoProvider (){}

    public static DaoProvider getInstance() {
        return instance;
    }

}
