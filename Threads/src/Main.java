public class Main {
    public static void main(String[] args) {

        //extensao
        //ThreadSubclasseExtensao novaT = new ThreadSubclasseExtensao(200);
        //novaT.start();

        //interface
        ThreadInterfaceImplementacao novaT = new ThreadInterfaceImplementacao(400);
        Thread t = new Thread(novaT);
        t.start();

    }
}