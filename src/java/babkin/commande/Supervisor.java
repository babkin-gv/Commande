package babkin.commande;

import babkin.commande.graphics.IPrinter;
import babkin.commande.graphics.Pult;
import babkin.commande.sandbox.Light;
import babkin.commande.sandbox.LightOnCommand;
import babkin.commande.sandbox.SimpleRemoteControl;

public class Supervisor implements IPrinter {
    private String[] textFieldStrings = new String[]{
            "Свет в доме", "Гараж", "Подвал", "Парковка", "Мастерская",
            "Теплица 1", "Теплица 2"
    };
    private Pult pult;
    private int buttonsCount = 1;
    private SimpleRemoteControl remoteControl;

    public Supervisor(){
        remoteControl = new SimpleRemoteControl();
        pult = new Pult(textFieldStrings, buttonsCount, this);
    }
    @Override
    public void print(String message) {
        //pult.setTextOut(message);
        remoteControl.buttonWasPressed();
    }
    public void start(){
        pult.setTextOut("Проба\nПривет Мир!");
        pult.myCreateAndShowAPI(pult);
        pult.setTextOut("Новая проба прошла!");

        Light light = new Light(pult);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);

    }
}
