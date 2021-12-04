package co.usa.ciclo3.retoCiclo3.Repository.crud;

import co.usa.ciclo3.retoCiclo3.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientCrudRepository extends CrudRepository<Client, Integer> {

    public List<Client>findAllByIdClient(Integer idClient);
}
