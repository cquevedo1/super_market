package com.example.demo.domain.service;

import com.example.demo.domain.Product;
import com.example.demo.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProductById(int productId) {
        return productRepository.getProductById(productId);
    }

    public  Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        if(getProductById(productId).isPresent()){
            productRepository.deleteById(productId);
            return true;
        }else {
            return false;
        }
    }
}
