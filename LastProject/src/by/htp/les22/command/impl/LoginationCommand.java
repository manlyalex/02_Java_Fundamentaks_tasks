package by.htp.les22.command.impl;

import by.htp.les22.command.Command;
import by.htp.les22.service.ServiceProvider;
import by.htp.les22.service.UserService;
import by.htp.les22.service.impl.ServiceException;
import by.htp.les22.service.impl.ValidateException;

public class LoginationCommand implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split("\\s");

        String commandName = params[0];
        ServiceProvider provider = ServiceProvider.getInstance();
        String response = "";

        UserService userService = provider.getUserService();
        String login = params[1].split("=")[1];
        String password = params[2].split("=")[1];
        boolean result = false;

        try {
            result = userService.logination(login, password);
            response = "All OK";
        } catch (ServiceException | ValidateException e) {
            e.printStackTrace();
            response = "error";
        }
        return response;
    }
}
