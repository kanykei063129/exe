package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import org.example.config.Config;
import org.example.entity.Bank;
import org.example.repository.RepositoryBank;

import java.util.List;

public class RepositoryBankImpl implements RepositoryBank {
    EntityManagerFactory entityManagerFactory = Config.getEntityManager();
    public String save(Bank bank) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bank);
        entityManager.getTransaction().commit();
        entityManager.close();
        return bank + "saved!!!";

    }

    public String delete(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Bank bank = entityManager.find(Bank.class,id);
        entityManager.remove(bank);
        entityManager.getTransaction().commit();
        entityManager.close();
        return bank.getName() + " is deleted!!!";
    }

    public List<Bank> getBanksByRegionName(String name) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            Query query = entityManager.createNativeQuery("SELECT * FROM banks b JOIN regions r ON b.region_id = r.id WHERE r.name = :name", Bank.class);
            query.setParameter("name", name);
            List<Bank> banks = query.getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
            return banks;
    }
}
