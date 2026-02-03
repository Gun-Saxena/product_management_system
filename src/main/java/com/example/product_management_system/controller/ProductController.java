package com.example.product_management_system.controller;

import com.example.product_management_system.model.ProductModel;
import com.example.product_management_system.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/add-product")
    public ProductModel addProduct(@Valid @RequestBody ProductModel product){
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<ProductModel> getProduct(){
        return service.getProduct();
    }

    @PutMapping("/update/{id}")
    public ProductModel updateProduct(@PathVariable String id, @RequestBody ProductModel product){
        return service.updateProduct(id,product);
    }

    @DeleteMapping("/deleteId/{id}")
    public ProductModel deleteById(@PathVariable String id){
        return service.deleteById(id);
    }
}

