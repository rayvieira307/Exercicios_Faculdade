package Exercicio;

import javax.persistence.Query;
import java.util.List;

public class ProfissionalDAO extends BaseDAO {

    public ProfissionalDAO() {
        super();
    }

    // Método para listar todos os profissionais
    public List<Profissional> listar() {
        Query query = entityManager.createQuery("SELECT p FROM Profissional p");
        return query.getResultList();
    }

    // Método para buscar um profissional pelo ID
    public Profissional buscarPorId(Long id) {
        return (Profissional) super.find(Profissional.class, id);
    }
}