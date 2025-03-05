package com.e_commerce.E_Commerce.services;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;
import com.e_commerce.E_Commerce.mapper.CategoryMapper;
import com.e_commerce.E_Commerce.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {


    private CategoryRepository categoryRepository;
    // No need I want to use @AllArgsConstructor
//    CategoryService(CategoryRepository categoryRepository){
//        this.categoryRepository = categoryRepository;
//    }


    //@_create category
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
       CategoryEntity category = CategoryMapper.toCategoryEntity(categoryDTO);
        category = categoryRepository.save(category);
        return CategoryMapper.tocategoryDTO(category);
    }


    //@_get all categories
    public List<CategoryDTO> getAllCategories(){
      return categoryRepository.findAll().stream().map(CategoryMapper::tocategoryDTO).toList();
    }

    //@_get category by id
    public CategoryDTO getCategoryById(Long id){
       CategoryEntity category = categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Category not find!"));
       return CategoryMapper.tocategoryDTO(category);
    }


    //@_delete category

    public String deleteCategory(Long id){
        categoryRepository.deleteById(id);
        return "Category" + id + "has been deleted!";
    }

}
