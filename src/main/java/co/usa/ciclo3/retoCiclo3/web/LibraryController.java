package co.usa.ciclo3.retoCiclo3.web;


import co.usa.ciclo3.retoCiclo3.model.Library;
import co.usa.ciclo3.retoCiclo3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/Lib/all")
    public List<Library> getAll() {
        return libraryService.getAll();
    }

    @GetMapping("/Lib/{id}")

    public Library get(@PathVariable("id") Integer id) {
        return libraryService.getLibrary(id);
    }

    @PostMapping("/Lib/save")
    public ResponseEntity<?> post(@RequestBody Library library) {
        libraryService.save(library);
        return ResponseEntity.status(201).build();
    }
}
