package DAO;

import java.sql.SQLException;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

        try {
            // Consultar todos os alunos
            List<Aluno2> alunos = alunoDAO.obterTodos();
            for (Aluno2 aluno : alunos) {
                System.out.println("Aluno: " + aluno.nome + " (" + aluno.matricula + ") - " + aluno.ano);
            }

            // Consultar um aluno específico
            Aluno2 aluno = alunoDAO.obter("123456");
            if (aluno != null) {
                System.out.println("Aluno encontrado: " + aluno.nome);
            } else {
                System.out.println("Aluno não encontrado.");
            }

            // Inserir um novo aluno
            Aluno2 novoAluno = new Aluno2("789012", "Carlos Silva", 2025);
            alunoDAO.incluir(novoAluno);

            // Alterar um aluno
            aluno.setNome("Carlos Silva Junior");
            alunoDAO.alterar(aluno);

            // Excluir um aluno
            alunoDAO.excluir("789012");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}