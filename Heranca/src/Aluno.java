public class Aluno {

    //Atributos
    private String nome;
    private int idade;
    //Métodos
    public Aluno ( String nome , int idade ) {
        this.nome = nome;
        this.idade = idade;
    }
    public void definirNome ( String nome ) {
        this.nome = nome;
    }
    public void definirIdade ( int idade ) {
        this.idade = idade;
    }
    public String recuperarNome () {
        return this.nome;
    }
}