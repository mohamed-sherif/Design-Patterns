package com.dp.commands;

import com.dp.Command;
import com.dp.reciever.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.powerOn();
        stereo.setVolume(10);
    }

    @Override
    public void execute() {
      stereo.powerOff();
      stereo.setVolume(0);
    }
}
