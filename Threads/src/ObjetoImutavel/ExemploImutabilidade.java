package ObjetoImutavel;

public class ExemploImutabilidade {

    public static void main(String[] args) {
        // Criando uma instância de Pessoa
        Pessoa pessoa = new Pessoa("Rayssa", 19);

        // Exibindo os dados da pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Tentando alterar os dados de 'pessoa' não é possível porque a classe 'Pessoa' é imutável
        // Por exemplo, não há métodos setNome ou setIdade, e os atributos são finais.
        // A seguir, qualquer tentativa de modificar os atributos resultaria em erro de compilação.
    }
}