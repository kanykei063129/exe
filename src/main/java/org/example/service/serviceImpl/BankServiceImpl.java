package org.example.service.serviceImpl;

import org.example.entity.Bank;
import org.example.repository.RepositoryBank;
import org.example.repository.repositoryImpl.RepositoryBankImpl;
import org.example.service.BankService;

import java.util.List;

public class BankServiceImpl implements BankService {
    RepositoryBank repositoryBank = new RepositoryBankImpl();
    public String save(Bank bank) {
        return repositoryBank.save(bank);
    }

    public String delete(Long id) {
        return repositoryBank.delete(id);
    }

    public List<Bank> getBanksByRegionName(String name) {
     return repositoryBank.getBanksByRegionName(name);
    }
}
