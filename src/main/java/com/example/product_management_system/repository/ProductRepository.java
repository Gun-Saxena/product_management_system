package com.example.product_management_system.repository;

import com.example.product_management_system.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends MongoRepository<ProductModel,String> {
}

