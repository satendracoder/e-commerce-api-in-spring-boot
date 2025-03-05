package com.e_commerce.E_Commerce.controllers;

import com.e_commerce.E_Commerce.dto.ProductDTO;
import com.e_commerce.E_Commerce.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    //@_getProduct
    //@_createProduct
    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        return new ResponseEntity<>(productService.createProduct(productDTO), HttpStatus.CREATED);
    }
    //@update product
    //@delete product
    //@get product by id

}
