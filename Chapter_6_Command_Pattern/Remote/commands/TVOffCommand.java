package Chapter_6_Command_Pattern.Remote.commands;

import Chapter_6_Command_Pattern.Remote.devices.TV;

public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
