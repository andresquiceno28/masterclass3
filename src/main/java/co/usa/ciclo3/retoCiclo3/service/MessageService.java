package co.usa.ciclo3.retoCiclo3.service;

import co.usa.ciclo3.retoCiclo3.Repository.crud.MessageCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageCrudRepository messageCrudRepository;

    public void save(Message message){
        messageCrudRepository.save(message);
    }

    public List<Message> getAll(){
        return (List<Message>)messageCrudRepository.findAll();
    }

    public Message getMessage(Integer idMessage){
        return messageCrudRepository.findById(idMessage).orElse(null);
    }


}
