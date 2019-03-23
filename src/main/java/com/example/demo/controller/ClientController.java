package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("geClient/{id}")
    public Client getClient(@PathVariable int id) {
        return clientService.getClient(id);
    }

    @PostMapping("saveClient")
    public void saveUser(@RequestBody Client client) {
        clientService.saveClient(client);
    }
}
