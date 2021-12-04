package co.usa.ciclo3.retoCiclo3.web;

import co.usa.ciclo3.retoCiclo3.model.Message;
import co.usa.ciclo3.retoCiclo3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/Message/all")
    public List<Message> save() {
        return messageService.getAll();
    }

    @GetMapping("/Message/{id}")
    public Message get(@PathVariable("id") Integer idMessage) {
        return messageService.getMessage(idMessage);
    }

    @PutMapping("/Message/update")
    public ResponseEntity<?> put(@RequestBody Message message) {
        messageService.save(message);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/Message/save")
    public ResponseEntity<?> post(@RequestBody Message message) {
        messageService.save(message);
        return ResponseEntity.status(201).build();
    }


}
