package com.example.k2hw11.controller;

import com.example.k2hw11.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items) {
        return clientService.addAll(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return clientService.getAll();
    }
}
