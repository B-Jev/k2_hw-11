package com.example.k2hw11.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientServiceImpl implements ClientService {
    private final Client client;

    public ClientServiceImpl(Client client) {
        this.client = client;
    }

    @Override
    public List<Integer> addAll(List<Integer> idList) {
        return client.addItems(idList);
    }

    @Override
    public List<Integer> getAll() {
        return client.getItems();
    }
}
