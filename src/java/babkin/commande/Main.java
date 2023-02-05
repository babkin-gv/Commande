package babkin.commande;

import babkin.commande.graphics.Pult;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        supervisor.start();
    }
}
