public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Teste A");
        Pessoa p2 = new Pessoa("Teste B");
        System.out.println("[Pessoa 1] nome: "+p1.getNome()+", Código Identificador: "+p1.getCodigoIdentificador());
        System.out.println("[Pessoa 2] nome: "+p2.getNome()+", Código Identificador: "+p2.getCodigoIdentificador());

        Referencia r = new Referencia ();
        System.out.println("Fim da Execução ");

    }
}