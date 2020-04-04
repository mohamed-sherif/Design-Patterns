package com.dp.commands;

import com.dp.Command;
import com.dp.reciever.Tv;

public class TvOffCommand implements Command {
    private Tv television;

    public TvOffCommand(Tv television) {
        this.television = television;
    }

    @Override
    public void undo() {
          television.turnOn();
    }

    @Override
    public void execute() {
       television.turnOff();
    }
}
