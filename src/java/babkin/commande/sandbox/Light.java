package babkin.commande.sandbox;

import babkin.commande.graphics.Pult;

public class Light {
    private Pult pult;
    public Light(Pult pult){
        this.pult = pult;
    }
    public void on(){
        pult.setTextOut("���� �������");
    }
    public void off(){
        pult.setTextOut("���� ��������");
    }
}
