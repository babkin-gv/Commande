package babkin.commande.listcommands;

import babkin.commande.baseclasses.CeilingFan;
import babkin.commande.baseclasses.Light;
import babkin.commande.interfaces.ICommand;

public class CeilingFanOnCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on(); ceilingFan.setQualityHight();
    }
}
