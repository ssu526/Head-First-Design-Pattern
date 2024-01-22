package Chapter_06_Command_Pattern.Remote.commands;

import Chapter_06_Command_Pattern.Remote.devices.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
