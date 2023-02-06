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
        pult.setTextOut("Стереосистема " + inRoom + " включена");
    }
    public void off(){
        pult.setTextOut("Стереосистема " + inRoom + " выключена");
    }
    public void setCD(){
        pult.setTextOut("Установлен CD диск");
    }
    public void setDVD(){
        pult.setTextOut("Установлен DVD диск");
    }
    public void setRadio(){
        pult.setTextOut("Настроено радио");
    }
    public void setVolime(String value){
        pult.setTextOut("Изменен звук до " + value);
    }
}
