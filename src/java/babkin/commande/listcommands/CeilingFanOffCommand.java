package babkin.commande.listcommands;

import babkin.commande.baseclasses.CeilingFan;
import babkin.commande.interfaces.ICommand;

public class CeilingFanOffCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
