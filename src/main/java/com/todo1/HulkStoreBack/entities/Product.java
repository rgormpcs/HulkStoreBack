package com.todo1.HulkStoreBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Product implements Serializable {
    @Id
    private Long id;
    private String name;
    private Double price;
    private String brand;
    private String image;
    private String amount;
}
