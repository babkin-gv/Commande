package babkin.commande.listcommands;

import babkin.commande.baseclasses.Light;
import babkin.commande.interfaces.ICommand;

public class KitchenLightOffCommand implements ICommand {
    private Light light;

    public KitchenLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
