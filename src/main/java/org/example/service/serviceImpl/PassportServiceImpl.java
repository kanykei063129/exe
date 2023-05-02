package org.example.service.serviceImpl;

import org.example.entity.Passport;
import org.example.repository.RepositoryPasssport;
import org.example.repository.repositoryImpl.RepositoryPassportImpl;
import org.example.service.PassportService;

public class PassportServiceImpl implements PassportService {
    RepositoryPasssport repositoryPasssport = new RepositoryPassportImpl();
    public String save(Passport passport) {
        return repositoryPasssport.save(passport);
    }

    public String deleteAllPassport() {
        return repositoryPasssport.deleteAllPassport();
    }

    public void assignPassportToClient(Long id, Long idd) {
   repositoryPasssport.assignPassportToClient(id,idd);
    }
}
