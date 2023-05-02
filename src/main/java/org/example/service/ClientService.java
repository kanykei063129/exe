package org.example.service;

import org.example.entity.Client;

public interface ClientService {
    String save(Client client);
    String beleteById(Long id);
    Client findById(Long id);
}
