package com.e_commerce.E_Commerce.mapper;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;

public class CategoryMapper {

    public static CategoryDTO tocategoryDTO(CategoryEntity category){
        if (category==null){
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setProductDTOList(category.getProductEntityList().stream()
                .map(ProductMapper::toproductDTO).toList());
        return categoryDTO;
    }

    public static CategoryEntity toCategoryEntity(CategoryDTO categoryDTO){
        CategoryEntity category = new CategoryEntity();
        category.setName(categoryDTO.getName());
        return category;
    }
}
