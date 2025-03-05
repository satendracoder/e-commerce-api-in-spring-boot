package com.e_commerce.E_Commerce.mapper;

import com.e_commerce.E_Commerce.dto.CategoryDTO;
import com.e_commerce.E_Commerce.dto.ProductDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;
import com.e_commerce.E_Commerce.entities.ProductEntity;

public class ProductMapper {

    //@_entity to DTO
    public static ProductDTO toproductDTO(ProductEntity productEntity){
        return new ProductDTO(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getCategory().getId()
        );
    }

    //@_Dto to Entity

    public static ProductEntity toproductEntity(ProductDTO productDTO, CategoryEntity category){
        ProductEntity product = new ProductEntity();
        //product.setId(productDTO.getId()); No need
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);

        return product;
    }
}
