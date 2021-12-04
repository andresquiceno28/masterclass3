package co.usa.ciclo3.retoCiclo3.Repository.crud;

import co.usa.ciclo3.retoCiclo3.model.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryCrudRepository extends CrudRepository<Library, Integer> {

    public List<Library>findAllById(Integer id);


}
