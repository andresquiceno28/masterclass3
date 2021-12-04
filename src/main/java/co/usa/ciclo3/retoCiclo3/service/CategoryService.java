package co.usa.ciclo3.retoCiclo3.service;

import co.usa.ciclo3.retoCiclo3.Repository.crud.CategoryCrudRepository;
import co.usa.ciclo3.retoCiclo3.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryCrudRepository categoryRepository;

    public void save(Category category){
        categoryRepository.save(category);
    }
    public List<Category> getAll(){

        return (List<Category>)categoryRepository.findAll();
    }
    public Category getCategory(Integer id){

        return categoryRepository.findById(id).orElse(null);
    }

}
