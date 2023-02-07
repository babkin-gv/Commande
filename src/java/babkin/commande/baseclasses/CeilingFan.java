package babkin.commande.baseclasses;
import babkin.commande.graphics.Pult;
public class CeilingFan {
    private Pult pult;
    private String inRoom;
    public CeilingFan(String inRoom, Pult pult) {
        this.inRoom = inRoom;
        this.pult = pult;
    }
    public void on() {
        pult.setTextOut("���������� ���������� "
                + inRoom + " �������");
    }
    public void off() {
        pult.setTextOut("���������� ���������� "
                + inRoom + " ��������");
    }
    public void setQualityHight(){
        pult.setTextOut("����������� ������� �������� ������������");
    }
    public void setQualityLow(){
        pult.setTextOut("����������� ������ �������� ������������");
    }
}
