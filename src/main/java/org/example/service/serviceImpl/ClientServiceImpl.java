package org.example.service.serviceImpl;

import org.example.entity.Client;
import org.example.repository.RepositoryClient;
import org.example.repository.repositoryImpl.RepositoryClientImpl;
import org.example.service.ClientService;

public class ClientServiceImpl implements ClientService {
    RepositoryClient repositoryClient = new RepositoryClientImpl();
    public String save(Client client) {
        return repositoryClient.save(client);
    }

    public String beleteById(Long id) {
        return repositoryClient.beleteById(id);
    }

    public Client findById(Long id) {
    return repositoryClient.findById(id);
    }
}
