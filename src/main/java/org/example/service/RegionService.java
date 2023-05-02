package org.example.service;

import org.example.entity.Region;

import java.util.List;

public interface RegionService {
    String save(Region region);
    List<Region> getAll();
    void update(Long id,Region region);
}
