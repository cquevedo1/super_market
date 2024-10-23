package com.example.demo.domain.repository;

import com.example.demo.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product> getByCategory(Long categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProductById(int productId);
    void deleteById(int productId);
}
