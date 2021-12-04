package co.usa.ciclo3.retoCiclo3.Repository.crud;

import co.usa.ciclo3.retoCiclo3.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

    public List<Category> findAllById(Integer id);

}
