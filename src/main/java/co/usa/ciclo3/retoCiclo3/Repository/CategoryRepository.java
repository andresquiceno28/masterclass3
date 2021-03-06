package co.usa.ciclo3.retoCiclo3.Repository;

import co.usa.ciclo3.retoCiclo3.Repository.crud.CategoryCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){

        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){

        return categoryCrudRepository.findById(id);
    }

    public Category save(Category c){

        return categoryCrudRepository.save(c);
    }
}
