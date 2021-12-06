package pobj.td10;

public class CommandRobotMoveY implements ICommand {
    private double dy;

    public CommandRobotMoveY(double dy) {
        this.dy = dy;
    }

    @Override
    public boolean execute(IRobot robot) {
        return robot.moveY(dy);
    }

}
