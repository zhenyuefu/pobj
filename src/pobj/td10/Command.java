package pobj.td10;

public class Command implements ICommand {

    private int command;
    private IRobot robotArg;
    private double doubleArg;
    private String stringArg;

    public static final int commandMoveX = 0;
    public static final int commandMoveY = 1;
    public static final int commandSetMessage = 2;

    @Override
    public boolean execute() {
        switch (command) {
            case commandMoveX:
                return robotArg.moveX(doubleArg);
            case commandMoveY:
                return robotArg.moveY(doubleArg);
            case commandSetMessage:
                robotArg.setMessage(stringArg);
                return true;
        }
        return false;
    }

}
