package org.example.repository;

import org.example.entity.Region;

import java.util.List;

public interface RepositoryRegion {
    String save(Region region);
    List<Region> getAll();
    void update(Long id,Region region);
}
