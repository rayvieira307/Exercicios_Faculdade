package Monitor;

public class Buffer {
    private int item;
    private boolean vazio = true; // Indica se o buffer está vazio ou cheio

    // Método produtor (adiciona um item no buffer)
    public synchronized void produzir(int item) throws InterruptedException {
        // Se o buffer não estiver vazio, aguarda o consumidor retirar o item
        while (!vazio) {
            wait(); // O produtor espera até que o consumidor consuma o item
        }

        // Coloca o item no buffer
        this.item = item;
        System.out.println("Produziu: " + item);

        // Agora o buffer não está mais vazio, o consumidor pode retirar o item
        vazio = false;
        // Notifica o consumidor que pode consumir o item
        notify();
    }

    // Método consumidor (retira um item do buffer)
    public synchronized void consumir() throws InterruptedException {
        // Se o buffer estiver vazio, aguarda o produtor adicionar um item
        while (vazio) {
            wait(); // O consumidor espera até que o produtor produza um item
        }

        // Retira o item do buffer
        System.out.println("Consumiu: " + item);
        // Agora o buffer está vazio, o produtor pode produzir um novo item
        vazio = true;
        // Notifica o produtor que pode produzir um novo item
        notify();
    }
}

