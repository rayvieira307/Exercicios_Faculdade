public class ThreadSubclasseExtensao extends Thread {

    long numero;

    ThreadSubclasseExtensao(long numero) {
        this.numero = numero;
    }

    public void run() {
        // Implementa o comportamento apropriado
        System.out.println("Número: " + numero);
    }
}

