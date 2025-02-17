package MapeamentoObjetoRelacional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String matricula;
    public String nome;
    public int ano;

    // Construtores
    public Aluno() { }

    public Aluno(String matricula, String nome, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
    }

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();

        // Definindo o driver e conexão
        try {
            // Registrar o driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            // Estabelecendo a conexão
            Connection c1 = DriverManager.getConnection(
                    "jdbc:derby://localhost:5432/loja", "postgres", "123456");

            // Criando o Statement e realizando a consulta
            Statement st = c1.createStatement();
            ResultSet r1 = st.executeQuery("SELECT * FROM ALUNO");

            // Preenchendo a lista com os alunos
            while (r1.next()) {
                lista.add(new Aluno(
                        r1.getString("MATRICULA"),  // Matrícula
                        r1.getString("NOME"),       // Nome
                        r1.getInt("ENTRADA")        // Ano (ou outro campo, conforme necessário)
                ));
            }

            // Fechando os recursos
            r1.close();
            st.close();
            c1.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // Imprime qualquer erro de conexão ou consulta
        }

        // Exibindo a lista de alunos
        for (Aluno aluno : lista) {
            System.out.println("Aluno: " + aluno.nome +
                    " (" + aluno.matricula + ") - " + aluno.ano);
        }
    }
}
