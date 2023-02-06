package babkin.commande.listcommands;

import babkin.commande.baseclasses.Light;
import babkin.commande.interfaces.ICommand;

public class LivingRoomLightOffCommand implements ICommand {
    private Light light;

    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
