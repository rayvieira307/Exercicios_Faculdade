package JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class AlunoDAO3 {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PostgrePU");

    public static void salvar(Aluno aluno) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();
    }

    public static List<Aluno> listarTodos() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Aluno> query = em.createQuery("SELECT a FROM Aluno a", Aluno.class);
        List<Aluno> alunos = query.getResultList();
        em.close();
        return alunos;
    }

    public static Aluno buscarPorMatricula(String matricula) {
        EntityManager em = emf.createEntityManager();
        Aluno aluno = em.find(Aluno.class, matricula);
        em.close();
        return aluno;
    }

    public static void fechar() {
        emf.close();
    }

    public static void main(String[] args) {
        // Salvar um novo aluno
        Aluno aluno = new Aluno("12345", "João da Silva", 2022);
        salvar(aluno);

        // Listar todos os alunos
        List<Aluno> alunos = listarTodos();
        for (Aluno a : alunos) {
            System.out.println(a);
        }

        // Buscar aluno por matrícula
        Aluno alunoEncontrado = buscarPorMatricula("12345");
        System.out.println("Aluno encontrado: " + alunoEncontrado);

        fechar();
    }
}