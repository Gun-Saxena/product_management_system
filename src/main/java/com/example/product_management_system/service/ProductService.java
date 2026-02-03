package com.example.product_management_system.service;

import com.example.product_management_system.model.ProductModel;
import com.example.product_management_system.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductModel addProduct(ProductModel product){
        return repository.save(product);
    }

    public List<ProductModel> getProduct(){
        return repository.findAll();
    }

    public ProductModel updateProduct(String id , ProductModel product){
        ProductModel existingProduct = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("No Product Found"));
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStock(product.getStock());

        return repository.save(existingProduct);

    }

    public ProductModel deleteById(String id){
        ProductModel exising = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("No ID Found"));
        repository.deleteById(id);
        return exising;
    }
}
