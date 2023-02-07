package babkin.commande.listcommands;

import babkin.commande.baseclasses.Light;
import babkin.commande.interfaces.ICommand;

public class KitchenLightOnCommand implements ICommand {
    private Light light;

    public KitchenLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
