package org.example.service;

import org.example.entity.Bank;

import java.util.List;

public interface BankService {
    String save(Bank bank);
    String delete(Long id);
    List<Bank> getBanksByRegionName(String name);
}
