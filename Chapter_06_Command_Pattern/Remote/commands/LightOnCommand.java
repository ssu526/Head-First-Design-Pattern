package Chapter_06_Command_Pattern.Remote.commands;

import Chapter_06_Command_Pattern.Remote.devices.Light;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
