package Exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BaseDAO {

    protected EntityManager entityManager;

    public BaseDAO() {
        this.entityManager = Persistence.createEntityManagerFactory("meuPU").createEntityManager();
    }

    public void save(Object entity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void update(Object entity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void delete(Object entity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Object find(Class<?> entityClass, Long id) {
        return entityManager.find(entityClass, id);
    }
}
