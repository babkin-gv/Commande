package babkin.commande.baseclasses;

import babkin.commande.graphics.Pult;

public class Light {
    private Pult pult;
    private String inRoom;
    public Light(String inRoom, Pult pult){
        this.inRoom = inRoom;
        this.pult = pult;
    }
    public void on(){
        pult.setTextOut("���� " + inRoom + " �������");
    }
    public void off(){
        pult.setTextOut("���� " + inRoom + " ��������");
    }
}
