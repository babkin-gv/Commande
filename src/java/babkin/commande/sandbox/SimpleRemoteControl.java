package babkin.commande.sandbox;

import babkin.commande.graphics.Pult;

public class SimpleRemoteControl {
    private ICommand slot;
    //public SimpleRemoteControl(Pult pult){
    //    this.pult=pult;
    //}
    public void setCommand(ICommand command){
        slot=command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
