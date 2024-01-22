package Chapter_06_Command_Pattern.Remote.commands;

import Chapter_06_Command_Pattern.Remote.devices.CeilingFan;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo(){
        switch (prevSpeed){
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            default:
                ceilingFan.off();
                break;
        }
    }
}
