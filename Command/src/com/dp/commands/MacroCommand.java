package com.dp.commands;

import com.dp.Command;

import java.util.ArrayList;

/*
 executes combo of commands,multiple commands at the same time
 NOTE: in computer science Macro = set
 */
public class MacroCommand implements Command {
    //Creating an arrayList to store the commands
    private ArrayList<Command>comboCommands;

    public MacroCommand() {
        comboCommands = new ArrayList<Command>();
    }

    public void addCommand(Command command){
        this.comboCommands.add(command);
    }

    @Override
    public void execute() {
        //Loop over the arrayList of commands and execute each command.
        for (Command command: comboCommands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        //Loop over the arrayList of commands in a reverse order to achieve the undo logic.
        for (int i = comboCommands.size()-1; i> -1;i--) {
            comboCommands.get(i).undo();
        }
    }
}
