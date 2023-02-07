package babkin.commande.listcommands;

import babkin.commande.baseclasses.GarageDoor;
import babkin.commande.interfaces.ICommand;

public class GarageDoorOpenCommand implements ICommand {
    private GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}