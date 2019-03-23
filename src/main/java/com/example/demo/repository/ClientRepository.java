package com.example.demo.repository;

import com.example.demo.model.Client;

public interface ClientRepository {
    void saveClient(Client client);
    Client getClient(int id);
}
