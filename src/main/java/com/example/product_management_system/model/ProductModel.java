package com.example.product_management_system.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
public class ProductModel {
    @Id
    private String id;
    @NotBlank(message = "Name cannot be null")
    private String name;
    private String description;
    private int price;
    private int stock;
}
