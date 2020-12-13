package by.htp.les22.command.impl;

import by.htp.les22.command.Command;
import by.htp.les22.entity.ex.ApplianceProductLaptop;
import by.htp.les22.service.ApplianceService;
import by.htp.les22.service.ServiceProvider;
import by.htp.les22.service.impl.ServiceException;

public class AddNewApplianceCommand implements Command {
    @Override
    public String execute(String request) {
        String[] params = request.split("\\s");
        String commandName = params[0];
        ServiceProvider provider = ServiceProvider.getInstance();
        String response = "";
        ApplianceService applianceService = provider.getApplianceService();
        String nameProduct = params[1].split("=")[1];

        String batteryCapacity = params[2].split("=")[1];
        float batteryCapacityFloat = Float.parseFloat(batteryCapacity);

        String OS = params[3].split("=")[1];

        String memoryRom = params[4].split("=")[1];
        int memoryRomInt = Integer.parseInt(memoryRom);

        String systemMemory = params[5].split("=")[1];
        int systemMemoryInt = Integer.parseInt(systemMemory);

        String CPU = params[6].split("=")[1];
        float CPUFloat = Float.parseFloat(CPU);

        String displayInches = params[7].split("=")[1];
        int displayInchesInt = Integer.parseInt(displayInches);

        String filePath = params[8].split("=")[1];
        ApplianceProductLaptop applianceProductLaptop = new ApplianceProductLaptop(nameProduct, batteryCapacityFloat, OS, memoryRomInt, systemMemoryInt, CPUFloat, displayInchesInt);

        try {
            applianceService.save(applianceProductLaptop, filePath);
            response = "OK";
        } catch (ServiceException e) {
            response = "NOT OK";
            e.printStackTrace();
        }
        return response;
    }
}
