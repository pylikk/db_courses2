package com.example.demo.repository;

import com.example.demo.model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void saveClient(Client client) {
        entityManager.persist(client);
    }

    @Override
    public Client getClient(int id) {
        return entityManager.find(Client.class, id);
    }
}
