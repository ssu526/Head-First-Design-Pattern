package Chapter_6_Command_Pattern.Remote.commands;

public interface Command {
    public void execute();
    public void undo();
}
