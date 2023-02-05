package babkin.commande.sandbox;

public class LightOnCommand implements ICommand {
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
