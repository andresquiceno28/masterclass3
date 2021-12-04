package co.usa.ciclo3.retoCiclo3.Repository;

import co.usa.ciclo3.retoCiclo3.Repository.crud.ClientCrudRepository;
import co.usa.ciclo3.retoCiclo3.Repository.crud.LibraryCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Client;
import co.usa.ciclo3.retoCiclo3.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){

        return (List<Client>) clientCrudRepository.findAll();
    }

    public Optional<Client> getClient(int id){

        return clientCrudRepository.findById(id);
    }

    public Client save(Client t){

        return clientCrudRepository.save(t);
    }
}
