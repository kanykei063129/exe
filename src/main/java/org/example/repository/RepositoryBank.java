package org.example.repository;

import org.example.entity.Bank;

import java.util.List;

public interface RepositoryBank {
    String save(Bank bank);
    String delete(Long id);
    List<Bank> getBanksByRegionName(String name);
}
