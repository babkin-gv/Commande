package babkin.commande.sandbox;

import babkin.commande.graphics.Pult;

public class GarageDoor{
    private Pult pult;
    public GarageDoor(Pult pult){
        this.pult = pult;
    }
    public void up(){
        pult.setTextOut("����� �������");
    }
    public void donw(){
        pult.setTextOut("����� �������");
    }
    public void lightOn(){
        pult.setTextOut("���� �������");
    }
    public void ligthOff(){
        pult.setTextOut("���� ��������");
    }

}
