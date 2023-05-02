package org.example.service.serviceImpl;

import org.example.entity.Region;
import org.example.repository.RepositoryRegion;
import org.example.repository.repositoryImpl.RepositoryRegionImpl;
import org.example.service.RegionService;

import java.util.List;

public class RegionServiceImpl implements RegionService {
    RepositoryRegion repositoryRegion = new RepositoryRegionImpl();
    public String save(Region region) {
        return repositoryRegion.save(region);
    }

    public List<Region> getAll() {
        return repositoryRegion.getAll();
    }

    public void update(Long id, Region region) {
        repositoryRegion.update(id, region);
    }
}
