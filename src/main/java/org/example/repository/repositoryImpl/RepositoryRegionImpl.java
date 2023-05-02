package org.example.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import org.example.config.Config;
import org.example.entity.Region;
import org.example.repository.RepositoryRegion;

import java.util.List;

public class RepositoryRegionImpl implements RepositoryRegion {
    EntityManagerFactory entityManagerFactory = Config.getEntityManager();

    public String save(Region region) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(region);
        entityManager.getTransaction().commit();
        entityManager.close();
        return region + "saved!!!";
    }

    public List<Region> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select r from Region r");
        List<Region> regions = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return regions;
    }

    public void update(Long id, Region region) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Region region1 = entityManager.find(Region.class, id);
        region1.setRegion_name(region.getRegion_name());
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
