public class ThreadInterfaceImplementacao implements Runnable {

    long numero;

    ThreadInterfaceImplementacao(long numero) {
        this.numero = numero;
    }

    public void run() {
        // Implementa o comportamento apropriado
        System.out.println("Número: " + numero);
    }
}

