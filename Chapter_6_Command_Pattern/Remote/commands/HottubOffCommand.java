package Chapter_6_Command_Pattern.Remote.commands;

import Chapter_6_Command_Pattern.Remote.devices.Hottub;

public class HottubOffCommand implements Command{
    Hottub hottub;

    public HottubOffCommand(Hottub hottub){
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
