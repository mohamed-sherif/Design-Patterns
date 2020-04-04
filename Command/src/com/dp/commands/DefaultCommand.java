package com.dp.commands;

import com.dp.Command;
/*
 Creating a null object design pattern to prevent null pointer exception when user hits an
 unassigned button on the remote controller by creating a default behavior.
 */
public class DefaultCommand implements Command {
    @Override
    public void execute() {
        System.out.println("E: This Button Is Not Wired With Any Device Yet!.");
    }

    @Override
    public void undo() {
        System.out.println("N: Nothing To Undo!.");
    }
}
