package co.usa.ciclo3.retoCiclo3.Repository;

import co.usa.ciclo3.retoCiclo3.Repository.crud.LibraryCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {

    @Autowired
    private LibraryCrudRepository libraryCrudRepository;

    public List<Library> getAll(){
        return (List<Library>) libraryCrudRepository.findAll();
    }

    public Optional<Library> getLibrary(int id){
        return libraryCrudRepository.findById(id);
    }

    public Library save(Library l){
        return libraryCrudRepository.save(l);
    }
}
