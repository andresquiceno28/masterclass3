package co.usa.ciclo3.retoCiclo3.web;

import co.usa.ciclo3.retoCiclo3.model.Client;
import co.usa.ciclo3.retoCiclo3.service.ClientService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api")

public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/Client/all")
    public List<Client> save() {
        return clientService.getAll();
    }

    @GetMapping("/Client/{idClient}")
    public Client get(@PathVariable ("idClient")Integer idClient) {
        return clientService.getClient(idClient);
    }

    @PostMapping("/Client/save")
    public ResponseEntity<?> post(@RequestBody Client cliente) {
        clientService.save(cliente);
        return ResponseEntity.status(201).build();
    }

}
