package com.example.demo.domain.repository;

import com.example.demo.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProductById(int productId);
    Product save(Product product);
    void deleteById(int productId);
}
