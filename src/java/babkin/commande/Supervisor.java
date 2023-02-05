package babkin.commande;

import babkin.commande.graphics.IPrinter;
import babkin.commande.graphics.Pult;

public class Supervisor implements IPrinter {
    private String[] textFieldStrings = new String[]{
            "Свет в доме", "Гараж", "Подвал", "Парковка", "Мастерская",
            "Теплица 1", "Теплица 2"
    };
    private Pult pult;
    private int buttonsCount = 9;

    public Supervisor(){
        pult = new Pult(textFieldStrings, buttonsCount, this);
    }
    @Override
    public void print(String message) {
        pult.setTextOut(message);
    }
    public void start(){
        pult.setTextOut("Проба\nПривет Мир!");
        pult.myCreateAndShowAPI(pult);
        pult.setTextOut("Новая проба прошла!");
    }
}
