package Monitor;

public class Consumidor extends Thread {
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consumir(); // Consome os itens
                Thread.sleep(1000); // Espera para simular o tempo de consumo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
