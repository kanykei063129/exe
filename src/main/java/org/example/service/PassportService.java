package org.example.service;

import org.example.entity.Passport;

public interface PassportService {
    String save(Passport passport);
    String deleteAllPassport();
    void assignPassportToClient(Long id,Long idd);
}
