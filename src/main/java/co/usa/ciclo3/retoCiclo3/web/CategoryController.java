package co.usa.ciclo3.retoCiclo3.web;

import co.usa.ciclo3.retoCiclo3.model.Category;
import co.usa.ciclo3.retoCiclo3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/Category/all")
    public List<Category> save() {
        return categoryService.getAll();
    }

    @GetMapping("/Category/{id}")
    public Category get(@PathVariable ("id") Integer id) {
        return categoryService.getCategory(id);
    }

    @PutMapping("/Category/update")
    public ResponseEntity<?> put(@RequestBody Category category) {
        categoryService.save(category);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/Category/save")
    public ResponseEntity<?> post(@RequestBody Category category) {
        categoryService.save(category);
        return ResponseEntity.status(201).build();
    }

}
