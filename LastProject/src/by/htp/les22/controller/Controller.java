package by.htp.les22.controller;

import by.htp.les22.command.Command;
import by.htp.les22.command.CommandProvider;


public class Controller {

    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) {// "logination login=123 password=123"


        String response = "";

        String commandName = request.split("\\s", 2)[0];

        Command command = provider.takeCommand(commandName);

        response = command.execute(request);

        return response;
    }
}
