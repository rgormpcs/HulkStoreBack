package com.todo1.HulkStoreBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.GeneratorType;

@Entity
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private String brand;
    private String image;
    private Integer amount;

    public Product(){}
    public Product(String name, Double price, String brand, String image, Integer amount) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.image = image;
        this.amount = amount;
    }


}
