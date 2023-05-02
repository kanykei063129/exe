package org.example.repository;

import org.example.entity.Passport;

public interface RepositoryPasssport {
    String save(Passport passport);
    String deleteAllPassport();
    void assignPassportToClient(Long id,Long idd);
}
