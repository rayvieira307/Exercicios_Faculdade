package Monitor;

public class Main3 {

    public static void main(String[] args) {
        // Cria o buffer compartilhado entre as threads
        Buffer buffer = new Buffer();

        // Cria as threads produtor e consumidor
        Thread produtor = new Produtor(buffer);
        Thread consumidor = new Consumidor(buffer);

        // Inicia as threads
        produtor.start();
        consumidor.start();
    }

}
