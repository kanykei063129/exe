package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.config.Config;
import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.entity.Passport;
import org.example.repository.RepositoryBank;
import org.example.repository.RepositoryClient;

public class RepositoryClientImpl implements RepositoryClient {
    EntityManagerFactory entityManagerFactory = Config.getEntityManager();

    public String save(Client client) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        entityManager.close();
        return client + "saved!!!";

    }

    public String beleteById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Client client = entityManager.find(Client.class,id);
        entityManager.remove(client);
        entityManager.getTransaction().commit();
        entityManager.close();
        return client.getFullName()+ " is deleted!!!";
    }

    public Client findById(Long id) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            Client client = entityManager.find(Client.class, id);
            entityManager.getTransaction().commit();
            entityManager.close();
            return client;
    }
}
