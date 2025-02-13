package Semaforo;

import java.util.concurrent.Semaphore;

public class PingPong {
    // Atributos
    private Semaphore s1, s2;
    private Controle contador;
    private Ping ping;
    private Pong pong;

    // Construtor
    public PingPong(int tamanho_partida) throws InterruptedException {
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
        contador = new Controle(tamanho_partida);
        ping = new Ping(s1, s2, contador);
        pong = new Pong(s1, s2, contador);

        // Inicia as threads
        new Thread(ping).start();
        new Thread(pong).start();

        s1.release();  // Libera a primeira permissão para iniciar a execução
    }
}