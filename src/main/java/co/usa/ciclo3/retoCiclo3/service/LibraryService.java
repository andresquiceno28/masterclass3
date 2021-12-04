package co.usa.ciclo3.retoCiclo3.service;

import co.usa.ciclo3.retoCiclo3.Repository.crud.LibraryCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LibraryService {

    @Autowired
    LibraryCrudRepository libraryCrudRepository;

    public void save(Library library){
        libraryCrudRepository.save(library);
    }

    public List<Library> getAll(){
        return (List<Library>)libraryCrudRepository.findAll();
    }

    public Library getLibrary(Integer id){
        return libraryCrudRepository.findById(id).orElse(null);
    }


}
