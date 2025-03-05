package com.e_commerce.E_Commerce.services;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;
import com.e_commerce.E_Commerce.mapper.CategoryMapper;
import com.e_commerce.E_Commerce.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    //@_get category by id
    //@_delete category
}
