package babkin.commande;

import babkin.commande.graphics.Pult;

public class Supervisor {
    private String[] textFieldStrings = new String[]{
            "���� � ����", "�����", "������", "��������", "����������",
            "������� 1", "������� 2"
    };
    private int buttonsCount = 9;
    public void start(){
        Pult pult = new Pult(textFieldStrings, buttonsCount);
        pult.myCreateAndShowAPI(pult);
    }
}
