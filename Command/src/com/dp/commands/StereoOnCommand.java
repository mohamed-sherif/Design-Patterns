package com.dp.commands;

import com.dp.Command;
import com.dp.reciever.Stereo;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    @Override
    public void undo() {
       stereo.setVolume(0);
       stereo.powerOff();
    }

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
       stereo.powerOn();
       stereo.setVolume(10);
    }
}
