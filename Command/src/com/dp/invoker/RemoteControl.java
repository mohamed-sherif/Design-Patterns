package com.dp.invoker;

import com.dp.Command;
import com.dp.commands.DefaultCommand;

public class RemoteControl {
    //array of all ON buttons in the remote controller
    private Command[] onCommands;
    //array of all Off buttons in the remote controller
    private Command[] offCommands;
    //undo button
    private Command lastCommand;

    //set array sizes inside constructor with default behavior
    public RemoteControl(){
        onCommands = new Command[5]; // 5 ON buttons for 5 different devices
        offCommands = new Command[5];

        for (int i =0; i<onCommands.length;i++){
            onCommands[i] = new DefaultCommand();
            offCommands[i] = new DefaultCommand();
        }
        lastCommand = new DefaultCommand();
    }

    //executing the command associated with the ON button
    public void pushOn(int index){
        onCommands[index].execute();
        //assign the undo button with the last executed ON command
        lastCommand = onCommands[index];
    }
    //executing the command associated with the Off button
    public void pushOff(int index){
        offCommands[index].execute();
        //assign the undo button with the last executed OFF command
        lastCommand = offCommands[index];
    }
    //executing the command associated with the undo button
    public void pushUndo(){
        System.out.println("### UNDO Pressed");
        lastCommand.undo();
    }
    //assign a command to a ON button.
    public void addOnCommand(int index,Command command){
        this.onCommands[index] =command;
    }
    //assign a command to a Off button
    public void addOffCommand(int index,Command command){
        this.offCommands[index] = command;
    }
}
