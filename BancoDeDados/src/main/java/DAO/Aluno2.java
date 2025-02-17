package DAO;

public class Aluno2 {
    public String matricula;  // Atributo privado
    public String nome;       // Atributo privado
    public int ano;           // Atributo privado

    // Construtor sem parâmetros
    public Aluno2() {}

    // Construtor com parâmetros
    public Aluno2(String matricula, String nome, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
    }

    // Getter para matricula
    public String getMatricula() {
        return matricula;
    }

    // Setter para matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para ano
    public int getAno() {
        return ano;
    }

    // Setter para ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Sobrescrever toString para facilitar a visualização
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                '}';
    }
}
