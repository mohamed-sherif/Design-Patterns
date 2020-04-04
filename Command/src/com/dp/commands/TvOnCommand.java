package com.dp.commands;

import com.dp.Command;
import com.dp.reciever.Tv;

public class TvOnCommand implements Command {
    private Tv television;

    public TvOnCommand(Tv television) {
        this.television = television;
    }

    @Override
    public void undo() {
         television.turnOff();
    }

    @Override
    public void execute() {
       television.turnOn();
    }
}
