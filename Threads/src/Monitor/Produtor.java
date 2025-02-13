package Monitor;

public class Produtor extends Thread {
    private Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produzir(i); // Produz itens de 1 a 5
                Thread.sleep(500); // Espera para simular o tempo de produção
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}