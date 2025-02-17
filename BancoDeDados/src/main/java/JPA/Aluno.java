package JPA;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @Column(name = "matricula")
    public String matricula;

    @Column(name = "nome")
    public String nome;

    @Column(name = "ano")
    public int ano;

    // Construtores, getters e setters
    public Aluno() {}

    public Aluno(String matricula, String nome, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                '}';
    }
}