package com.dp;

import com.dp.commands.*;
import com.dp.invoker.RemoteControl;
import com.dp.reciever.Light;
import com.dp.reciever.Stereo;
import com.dp.reciever.Tv;
/*
  This source code is an example on "command design pattern" implementation.
  In this example we have a remote controller with 5 ON buttons and 5 OFF buttons, each pair
  of (ON,OFF) buttons is associated with a different device ex:(light bulb,tv,stereo,..etc.),
  undo button to undo the last action ex:(from tv ON -TO-> tv OFF) and a combo button that can
  operate more than one device at the same time ex:(switching tv,stereo and light bulb at the same time).

  @author: Mohamed Sherif Hosny.
 */
public class User {

    public static void main(String[] args) {
	    //initializing the remote controller
        RemoteControl remoteControl = new RemoteControl();
        /*
        ==================================================================================
        connecting device_1 to the remote controller
        ==================================================================================
        */
        Light light = new Light();//Device_1
        LightOnCommand lightOnCommand = new LightOnCommand(light);//Device_1 ON Command
        LightOffCommand lightOffCommand = new LightOffCommand(light);//Device_1 OFF Command
        remoteControl.addOnCommand(0,lightOnCommand);//Device_1 ON Button
        remoteControl.addOffCommand(0,lightOffCommand);//Device_1 OFF Button
        /*
        ====================================================================================
        connecting device_2 to the remote controller
        =====================================================================================
        */
        Tv televesion = new Tv();//Device_2
        TvOnCommand tvOnCommand = new TvOnCommand(televesion);//Device_2 ON Command
        TvOffCommand tvOffCommand = new TvOffCommand(televesion);//Device_2 OFF Command
        remoteControl.addOnCommand(1,tvOnCommand); //Device_2 ON Button
        remoteControl.addOffCommand(1,tvOffCommand); //Device_2 OFF Button
        /*
        ======================================================================================
        connecting device_3 to the remote controller
        =======================================================================================
        */
        Stereo stereo = new Stereo();//Device_3
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);//Device_3 ON Command
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);//Device_3 OFF Command
        remoteControl.addOnCommand(2,stereoOnCommand);//Device_3 ON Button
        remoteControl.addOffCommand(2,stereoOffCommand);//Device_3 OFF Button
        /*
        ==========================================================================================
        Creating a macro command button that executes multiple commands when pressed
        ===========================================================================================
        */
        MacroCommand comboCommand = new MacroCommand();
        //add list of commands to be executed when Macro button is pressed
        comboCommand.addCommand(lightOnCommand);
        comboCommand.addCommand(tvOnCommand);
        comboCommand.addCommand(stereoOnCommand);
        //Macro command ON button
        remoteControl.addOnCommand(3,comboCommand);
        /*
        ---------------------------------------------------------------------
        ##################### using The Remote Controller ###################
        ---------------------------------------------------------------------
        */
         remoteControl.pushOn(0);
         remoteControl.pushOff(0);
         remoteControl.pushOn(1);
         remoteControl.pushOff(1);
         remoteControl.pushOn(2);
         remoteControl.pushOff(2);
         remoteControl.pushUndo();
         System.out.println("### Macro Button is pressed:");
         remoteControl.pushOn(3);
         remoteControl.pushOn(4); // Testing Default behaviour.
    }
}
