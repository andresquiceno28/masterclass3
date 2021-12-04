package co.usa.ciclo3.retoCiclo3.Repository.crud;

import co.usa.ciclo3.retoCiclo3.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

    public List<Message> findAllByIdMessage(Integer idMessage);
}
