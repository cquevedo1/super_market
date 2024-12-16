package com.example.demo.web.controller;

import com.example.demo.domain.Product;
import com.example.demo.domain.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable("id") int productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getProductByCategory(@PathVariable("categoryId") int categoryId) {
        return productService.getByCategory(categoryId);
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProductById(@PathVariable("id") int productId) {
        return productService.delete(productId);
    }
}
