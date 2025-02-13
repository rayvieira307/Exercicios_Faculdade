package ObjetoImutavel;


//classe tambem nao pode ser herdada
public final class Pessoa {
    private final String nome;
    private final int idade;

    // Construtor que inicializa todos os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters (não há setters, para garantir que os valores não possam ser alterados)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Se fosse necessário, poderíamos adicionar métodos adicionais, mas não permitir a modificação dos campos.
    // O objeto 'Pessoa' é imutável porque seus campos são finais e não existe um método que altera seu estado.
}


