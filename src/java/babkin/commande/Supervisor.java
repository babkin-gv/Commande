package babkin.commande;
import babkin.commande.baseclasses.Light;
import babkin.commande.baseclasses.Stereo;
import babkin.commande.graphics.IPrinter;
import babkin.commande.graphics.Pult;
import babkin.commande.listcommands.LivingRoomLightOffCommand;
import babkin.commande.listcommands.LivingRoomLightOnCommand;
import babkin.commande.listcommands.StereoOffCommand;
import babkin.commande.listcommands.StereoOnWithCommand;

public class Supervisor implements IPrinter {
    private String[] textFieldStrings = new String[]{
            "���� � ��������", "���� �� �����",
            "������� ����. � ����.", "�������� �����",
            "������ �������", "����� ����", "����� ���������"
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
        pult.setTextOut("�����\n������ ���!");
        pult.myCreateAndShowAPI(pult);
        pult.setTextOut("����� ����� ������!");

        //�������� ���������
        Light livingRoomLight = new Light("� ��������", pult);
        Stereo livingRoomStereo = new Stereo("� ��������", pult);
        //�������� ������ ��� ���������� ����������
        LivingRoomLightOnCommand livingRoomLightOnCommand =
                new LivingRoomLightOnCommand(livingRoomLight);
        LivingRoomLightOffCommand livingRoomLightOffCommand =
                new LivingRoomLightOffCommand(livingRoomLight);
        //�������� ������ ��� ���������� ��������������
        StereoOnWithCommand stereoOnWithCommand =
                new StereoOnWithCommand(livingRoomStereo);
        StereoOffCommand stereoOffCommand =
                new StereoOffCommand(livingRoomStereo);
        //������� ������� ����������� � �������� ������
        remoteControl.setCommand(0, livingRoomLightOnCommand,
                livingRoomLightOffCommand);
        remoteControl.setCommand(4, stereoOnWithCommand,
                stereoOffCommand);
    }
}
