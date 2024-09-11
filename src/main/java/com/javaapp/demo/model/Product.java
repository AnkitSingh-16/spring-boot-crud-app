package com.javaapp.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity // if you want to have a class which you want to create a table
public class Product {

    @Id //this is used to define prodid as primary key
    private int prodId;
    private String prodName;
    private int price;

    
    public Product() {
    }
    
    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
    public int getProdId() {
        return prodId;
    }
    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
    }
    
    

    
}
