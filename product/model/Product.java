package com.mysmartshop.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

 

    @Id
    private String productId;
    private String name;
    private float price;
    private String desc;

 

    public Product(String productId, String name, float price, String desc) {
        super();
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

 

    public Product() {
        super();
    }

 

    public String getProductId() {
        return productId;
    }

 

    public void setProductId(String productId) {
        this.productId = productId;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public float getPrice() {
        return price;
    }

 

    public void setPrice(float price) {
        this.price = price;
    }

 

    public String getDesc() {
        return desc;
    }

 

    public void setDesc(String desc) {
        this.desc = desc;
    }

 

}
