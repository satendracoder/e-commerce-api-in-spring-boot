package com.e_commerce.E_Commerce.controllers;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    //@_Get all Categories
    @GetMapping
    public List<CategoryDTO> getAllCategories(){
        return categoryService.getAllCategories();
    }
    //@_Create Categories
    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO){
        return new ResponseEntity<>(categoryService.createCategory(categoryDTO), HttpStatus.CREATED);
    }
    //@_Get category by id

    @GetMapping("/{id}")
    public CategoryDTO getCategoryById(@PathVariable Long id){
      return categoryService.getCategoryById(id);
    }

    //@_Delete category
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id){
       return categoryService.deleteCategory(id);
    }
}
