package Chapter_6_Command_Pattern.Remote.commands;

public class NoCommand implements Command{
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
