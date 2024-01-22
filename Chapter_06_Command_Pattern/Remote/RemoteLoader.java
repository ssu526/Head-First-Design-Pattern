package Chapter_06_Command_Pattern.Remote;

import Chapter_06_Command_Pattern.Remote.commands.*;
import Chapter_06_Command_Pattern.Remote.devices.Hottub;
import Chapter_06_Command_Pattern.Remote.devices.Light;
import Chapter_06_Command_Pattern.Remote.devices.Stereo;
import Chapter_06_Command_Pattern.Remote.devices.TV;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Create devices
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        // create commands
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // Set up remote control
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.setCommand(1, lightOn, lightOff);
        remoteControl.setCommand(2, stereoOn, stereoOff);
        remoteControl.setCommand(3, tvOn, tvOff);
        remoteControl.setCommand(4, hottubOn, hottubOff);


        System.out.println(remoteControl);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        remoteControl.onButtonPushed(3);
        remoteControl.offButtonPushed(3);
        remoteControl.undoButtonPushed();
    }
}
