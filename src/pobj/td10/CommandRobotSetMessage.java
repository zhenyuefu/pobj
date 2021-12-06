package pobj.td10;

public class CommandRobotSetMessage implements ICommand {

    private String message;

    public CommandRobotSetMessage(String message) {
        this.message = message;
    }

    public boolean execute(IRobot robot) {
        robot.setMessage(message);
        return true;
    }

}
