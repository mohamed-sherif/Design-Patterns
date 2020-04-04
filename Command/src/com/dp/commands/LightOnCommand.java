package com.dp.commands;

import com.dp.Command;
import com.dp.reciever.Light;

public class LightOnCommand implements Command {

    @Override
    public void undo() {
      light.switchOff();
    }

    private Light light;

    public LightOnCommand(Light light){
       this.light =light;
    }
    @Override
    public void execute() {
       light.switchOn();
    }
}
