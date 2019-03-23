package com.example.demo.service;

import com.example.demo.model.Client;

public interface ClientService {
    void saveClient(Client client);
    Client getClient(int id);
}
