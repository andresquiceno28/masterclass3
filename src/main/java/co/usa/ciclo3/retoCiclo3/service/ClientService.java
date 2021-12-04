package co.usa.ciclo3.retoCiclo3.service;


import co.usa.ciclo3.retoCiclo3.Repository.crud.ClientCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientCrudRepository clientRepository;

    public void save(Client client){
        clientRepository.save(client);
    }

    public List<Client> getAll(){
        return (List<Client>)clientRepository.findAll();
    }

    public Client getClient(Integer idClient){
        return clientRepository.findById(idClient).orElse(null);

    }

}
