package com.example.demo.web.controller;

import com.example.demo.domain.Product;
import com.example.demo.domain.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    public Optional<Product> getProductById(int productId) {
        return productService.getProductById(productId);
    }

    public Optional<List<Product>> getProductByCategory(int categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productService.save(product);
    }

    public boolean deleteProductById(int productId) {
        return productService.delete(productId);
    }
}
