package com.microservice_app.product_service.controller;


import com.microservice_app.product_service.dto.ProductRequest;
import com.microservice_app.product_service.dto.ProductResponse;
import com.microservice_app.product_service.model.Product;
import com.microservice_app.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
         return productService.getAllProducts();
    }
}
