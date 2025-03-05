package com.e_commerce.E_Commerce.services;

import com.e_commerce.E_Commerce.dto.ProductDTO;
import com.e_commerce.E_Commerce.entities.CategoryEntity;
import com.e_commerce.E_Commerce.entities.ProductEntity;
import com.e_commerce.E_Commerce.mapper.ProductMapper;
import com.e_commerce.E_Commerce.repositories.CategoryRepository;
import com.e_commerce.E_Commerce.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public ProductDTO createProduct(ProductDTO productDTO){
       //Check Category Id
       CategoryEntity category = categoryRepository.findById(productDTO.getCategoryId())
                .orElseThrow(()-> new RuntimeException("Category not found!"));
            // DTO -> Entity
       ProductEntity product = ProductMapper.toproductEntity(productDTO, category);
        product = productRepository.save(product);

        // Entity to DTO
        return ProductMapper.toproductDTO(product);
    }
}
