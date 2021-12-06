package pobj.td10;

import java.util.List;

public class Executor {

    public static boolean executePlan(List<ICommand> plan, IRobot robot) {
        for (ICommand command : plan) {
            if (!command.execute(robot)) {
                return false;
            }
        }
        return true;
    }
}
