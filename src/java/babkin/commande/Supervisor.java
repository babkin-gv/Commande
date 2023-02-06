package babkin.commande;

import babkin.commande.graphics.IPrinter;
import babkin.commande.graphics.Pult;
import babkin.commande.sandbox.*;

public class Supervisor implements IPrinter {
    private String[] textFieldStrings = new String[]{"���� � ������", "����� � ������",
            "���� � ����", "�����", "������", "��������", "����������",
            "������� 1", "������� 2"
    };
    private Pult pult;
    private int buttonsCount = 2;
    private SimpleRemoteControl remoteControl;

    public Supervisor(){
        remoteControl = new SimpleRemoteControl();
        pult = new Pult(textFieldStrings, buttonsCount, this);
    }
    @Override
    public void print(String message) {
        if (message.equals("on0")){
            Light light = new Light(pult);
            LightOnCommand lightOnCommand = new LightOnCommand(light);
            remoteControl.setCommand(lightOnCommand);
            remoteControl.buttonWasPressed();
        }
        if (message.equals("on1")) {
            GarageDoor garageDoor = new GarageDoor(pult);
            GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
            remoteControl.setCommand(garageDoorOpenCommand);
            remoteControl.buttonWasPressed();
        }
    }
    public void start(){
        pult.setTextOut("�����\n������ ���!");
        pult.myCreateAndShowAPI(pult);
        pult.setTextOut("����� ����� ������!");

    }
}
