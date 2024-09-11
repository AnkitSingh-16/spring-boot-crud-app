package com.javaapp.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javaapp.demo.model.Product;

@Service
public class ProductService {

    
    List<Product> products = new ArrayList<>(Arrays.asList(
    new Product(101, "iphone", 50000),
    new Product(102, "camera", 20000),
    new Product(103, "Mic", 1000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductsById(int prodId) {
        // this method will find the product by prodid using stream api
        // return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();

        // you can also return a dummy product when you did not find any product using below code
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst()
                .orElse(new Product(100, "No items", 0));
    }
    
    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId)
                index = i;
        }
        products.remove(index);
    }

}
