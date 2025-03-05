package com.e_commerce.E_Commerce.mapper;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;

public class CategoryMapper {

//    public static CategoryDTO categoryDTO(CategoryEntity categoryEntity){
//        if (categoryEntity==null){
//            return null;
//        }
//        CategoryDTO categoryDTO = new CategoryDTO();
//        categoryDTO.setId(categoryDTO.getId());
//        categoryDTO.setName(categoryDTO.getName());
//        categoryDTO.setProductDTOList(categoryDTO.getProductDTOList());
//    }

    public static CategoryEntity toCategoryEntity(CategoryDTO categoryDTO){
        CategoryEntity category = new CategoryEntity();
        category.setName(categoryDTO.getName());
        return category;
    }
}
