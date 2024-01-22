package Chapter_06_Command_Pattern.Remote.commands;

import Chapter_06_Command_Pattern.Remote.devices.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
