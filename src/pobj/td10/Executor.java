package pobj.td10;

import java.util.List;

public class Executor {

    public static boolean executePlan(List<ICommand> plan) {
        for (ICommand command : plan) {
            if (!command.execute()) {
                return false;
            }
        }
        return true;
    }
}
