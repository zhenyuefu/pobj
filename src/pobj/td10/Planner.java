package pobj.td10;

import java.util.ArrayList;
import java.util.List;

public class Planner {

    private List<ICommand> commands = new ArrayList<>();

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public List<ICommand> getPlan() {
        return commands;
    }

}
