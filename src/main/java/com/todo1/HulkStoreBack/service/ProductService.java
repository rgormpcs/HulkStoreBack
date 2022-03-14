package com.todo1.HulkStoreBack.service;

import com.todo1.HulkStoreBack.entities.Product;
import com.todo1.HulkStoreBack.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
