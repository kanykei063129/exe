package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import org.example.config.Config;
import org.example.entity.Client;
import org.example.entity.Passport;
import org.example.entity.Region;
import org.example.repository.RepositoryPasssport;

public class RepositoryPassportImpl implements RepositoryPasssport {
    EntityManagerFactory entityManagerFactory = Config.getEntityManager();

    public String save(Passport passport) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(passport);
        entityManager.getTransaction().commit();
        entityManager.close();
        return passport + "saved!!!";
    }

    public String deleteAllPassport() {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("DELETE FROM Passport");
            int num = query.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            return "Deleted " + num + " table...";
        }

    public void assignPassportToClient(Long id, Long idd) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Client client = entityManager.find(Client.class,id);
        Passport passport = entityManager.find(Passport.class,id);
        client.setPassport(passport);
        passport.setClient(client);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
