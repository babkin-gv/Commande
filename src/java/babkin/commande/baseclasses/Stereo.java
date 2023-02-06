package babkin.commande.baseclasses;

import babkin.commande.graphics.Pult;

public class Stereo {
    private Pult pult;
    private String inRoom;
    public Stereo(String inRoom, Pult pult){
        this.inRoom = inRoom;
        this.pult = pult;
    }
    public void on(){
        pult.setTextOut("������������� " + inRoom + " ��������");
    }
    public void off(){
        pult.setTextOut("������������� " + inRoom + " ���������");
    }
    public void setCD(){
        pult.setTextOut("���������� CD ����");
    }
    public void setDVD(){
        pult.setTextOut("���������� DVD ����");
    }
    public void setRadio(){
        pult.setTextOut("��������� �����");
    }
    public void setVolime(String value){
        pult.setTextOut("������� ���� �� " + value);
    }
}
