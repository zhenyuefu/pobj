package pobj.td10;

public class CommandRobotMoveX implements ICommand {
    private double dx;

    public CommandRobotMoveX(double dx) {
        this.dx = dx;
    }

    public boolean execute(IRobot robot) {
        return robot.moveX(dx);
    }

}
