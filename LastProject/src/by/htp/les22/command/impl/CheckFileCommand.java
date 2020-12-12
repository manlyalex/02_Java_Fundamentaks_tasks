package by.htp.les22.command.impl;

import by.htp.les22.command.Command;
import by.htp.les22.service.ApplianceService;
import by.htp.les22.service.ServiceProvider;
import by.htp.les22.service.impl.ServiceException;

public class CheckFileCommand implements Command {
    @Override
    public String execute(String request) {
        String[] params = request.split("\\s");

        String commandName = params[0];
        ServiceProvider provider = ServiceProvider.getInstance();
        String response = "";
        ApplianceService applianceService = provider.getApplianceService();
        String pathFile = params[1].split("=")[1];

        boolean result = false;

        try {
            result = applianceService.checkFileExistence(pathFile);
            response = "File OK";
        } catch (ServiceException e) {
            response = "File NOT OK";
            e.printStackTrace();
        }
        return response;
    }
}
