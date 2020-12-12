package by.htp.les22.command;

import by.htp.les22.command.impl.AddNewApplianceCommand;
import by.htp.les22.command.impl.CheckFileCommand;
import by.htp.les22.command.impl.FindApplianceCommand;
import by.htp.les22.command.impl.LoginationCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("logination", new LoginationCommand());
        commands.put("check", new CheckFileCommand());
        commands.put("find", new FindApplianceCommand());
        commands.put("add", new AddNewApplianceCommand());
    }
    public Command takeCommand(String commandName) {
        return commands.get(commandName);
    }
}
