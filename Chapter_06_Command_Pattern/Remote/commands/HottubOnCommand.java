package Chapter_06_Command_Pattern.Remote.commands;

import Chapter_06_Command_Pattern.Remote.devices.Hottub;

public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
