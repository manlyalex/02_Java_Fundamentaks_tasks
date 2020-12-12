package by.htp.les22.command.impl;

import by.htp.les22.command.Command;
import by.htp.les22.service.ApplianceService;
import by.htp.les22.service.ServiceProvider;
import by.htp.les22.service.impl.ServiceException;

public class FindApplianceCommand implements Command {
    @Override
    public String execute(String request) {
        String[] params = request.split("\\s");
        String commandName = params[0];
        ServiceProvider provider = ServiceProvider.getInstance();
        String response= "";
        ApplianceService applianceService = provider.getApplianceService();
        String keyProduct = params[1].split("=")[1];
        String nameProduct = params[2].split("=")[1];

        try {
            response = applianceService.find(keyProduct, nameProduct).toString();
        } catch (ServiceException e) {
            response ="NOT OK";
            e.printStackTrace();
        }
        return response;
    }
}
