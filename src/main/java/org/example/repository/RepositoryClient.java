package org.example.repository;

import org.example.entity.Client;

public interface RepositoryClient {
    String save(Client client);
    String beleteById(Long id);
    Client findById(Long id);
}
