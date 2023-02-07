package babkin.commande.listcommands;

import babkin.commande.baseclasses.GarageDoor;
import babkin.commande.interfaces.ICommand;

public class GarageDoorCloseCommand  implements ICommand {
    private GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.ligthOff();
        garageDoor.donw();
    }
}
