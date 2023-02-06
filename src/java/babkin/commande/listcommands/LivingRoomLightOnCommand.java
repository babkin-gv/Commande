package babkin.commande.listcommands;

import babkin.commande.baseclasses.Light;
import babkin.commande.interfaces.ICommand;

public class LivingRoomLightOnCommand implements ICommand {
    private Light light;
    public LivingRoomLightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
