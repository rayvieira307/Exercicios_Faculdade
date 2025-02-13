package ExemploGeralThreads;

public class Principal {
    //Atributo
    private static Empresa ACME;

    //Métodos
    public static void main ( String args [ ] ) throws InterruptedException {
        // Empresa (número de fitas, empregados disponíveis, número máximo de equipes, produtos a serem empacotados)
        ACME = new Empresa ( 20 , 20 , 2 , 20 );
    }
}