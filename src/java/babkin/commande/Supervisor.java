package babkin.commande;
import babkin.commande.baseclasses.CeilingFan;
import babkin.commande.baseclasses.GarageDoor;
import babkin.commande.baseclasses.Light;
import babkin.commande.baseclasses.Stereo;
import babkin.commande.graphics.IPrinter;
import babkin.commande.graphics.Pult;
import babkin.commande.listcommands.*;

public class Supervisor implements IPrinter {
    private String[] textFieldStrings = new String[]{
            "Свет в гостиной", "Свет на кухне",
            "Потолочный вент. в гост.", "Гаражная дверь",
            "Стерео система", "Общий свет", "Режим вечеринки"
    };
    private Pult pult;
    private RemoteControl remoteControl;
    public final static int buttonsCount = 7;
    public Supervisor(){
        pult = new Pult(textFieldStrings,
                buttonsCount, this);
        remoteControl = new RemoteControl();
    }
    @Override
    public void print(String message) {
        pult.setTextOut(remoteControl.toString(message));
        if (message.length()==3){
            int slot = Integer.parseInt(message.substring(2, 3));
            remoteControl.onButtonWasPushed(slot);
        } else {
            int slot = Integer.parseInt(message.substring(3, 4));
            remoteControl.offButtonWasPushed(slot);
        }
    }
    public void start(){
        pult.setTextOut("Проба\nПривет Мир!");
        pult.myCreateAndShowAPI(pult);
        pult.setTextOut("Новая проба прошла!");

        //Создание устройств
        Light livingRoomLight = new Light("в гостиной", pult);
        Light kitchenLight = new Light("на кухне", pult);
        CeilingFan ceilingFan = new CeilingFan("в гостиной", pult);
        GarageDoor garageDoor = new GarageDoor(pult);
        Stereo livingRoomStereo = new Stereo("в гостиной", pult);
        //Создание команд для управления освещением
        LivingRoomLightOnCommand livingRoomLightOnCommand =
                new LivingRoomLightOnCommand(livingRoomLight);
        LivingRoomLightOffCommand livingRoomLightOffCommand =
                new LivingRoomLightOffCommand(livingRoomLight);
        KitchenLightOnCommand kitchenLightOnCommand =
                new KitchenLightOnCommand(kitchenLight);
        KitchenLightOffCommand kitchenLightOffCommand =
                new KitchenLightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOnCommand =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand =
                new CeilingFanOffCommand(ceilingFan);
        GarageDoorOpenCommand garageDoorOpenCommand =
                new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand =
                new GarageDoorCloseCommand(garageDoor);
        //Создание команд для управления стереосистемой
        StereoOnWithCommand stereoOnWithCommand =
                new StereoOnWithCommand(livingRoomStereo);
        StereoOffCommand stereoOffCommand =
                new StereoOffCommand(livingRoomStereo);
        //Готовые команды связываются с ячейками пульта
        remoteControl.setCommand(0, livingRoomLightOnCommand,
                livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand,
                kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanOnCommand,
                ceilingFanOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand,
                garageDoorCloseCommand);
        remoteControl.setCommand(4, stereoOnWithCommand,
                stereoOffCommand);
    }
}
