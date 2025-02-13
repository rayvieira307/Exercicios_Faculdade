package Semaforo;

public class Controle {
    private int controle;

    public Controle(int tamanho_partida) {
        this.controle = tamanho_partida;
    }

    public int getControle() {
        return controle;
    }

    public void decrementa() {
        if (controle > 0) {
            controle--;
        }
    }
}
