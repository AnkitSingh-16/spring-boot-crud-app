package com.javaapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaapp.demo.model.Product;
import com.javaapp.demo.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductsById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    
    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
