package Chapter_6_Command_Pattern.Remote.commands;

import Chapter_6_Command_Pattern.Remote.devices.TV;

public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
