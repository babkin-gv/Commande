package babkin.commande.sandbox;

import babkin.commande.graphics.Pult;

public class GarageDoor{
    private Pult pult;
    public GarageDoor(Pult pult){
        this.pult = pult;
    }
    public void up(){
        pult.setTextOut("Дверь открыта");
    }
    public void donw(){
        pult.setTextOut("Дверь закрыта");
    }
    public void lightOn(){
        pult.setTextOut("Свет включен");
    }
    public void ligthOff(){
        pult.setTextOut("Свет выключен");
    }

}
