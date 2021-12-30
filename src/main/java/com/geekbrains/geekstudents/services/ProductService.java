package com.geekbrains.geekstudents.services;

import com.geekbrains.geekstudents.entities.Product;
import com.geekbrains.geekstudents.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private IProductRepository productRepository;

    @Autowired
    public void setProductRepository(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getProductsByMyQuery();
    }
}
