package com.e_commerce.E_Commerce.services;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;
import com.e_commerce.E_Commerce.mapper.CategoryMapper;
import com.e_commerce.E_Commerce.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;
    //@_create category
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
       CategoryEntity category = CategoryMapper.toCategoryEntity(categoryDTO);
        categoryRepository.save(category);
    }
    //@_get all categories
    //@_get category by id
    //@_delete category
}
