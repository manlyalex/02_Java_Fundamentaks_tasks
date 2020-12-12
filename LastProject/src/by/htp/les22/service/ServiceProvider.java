package by.htp.les22.service;

import by.htp.les22.service.impl.ApplianceServiceImpl;
import by.htp.les22.service.impl.UserServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private ServiceProvider() {
    }

    private final UserService userService = new UserServiceImpl();
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public ApplianceService getApplianceService() {
        return applianceService;
    }
}
