package com.electroshop.inventory.service;

import com.electroshop.inventory.model.ProductModel;
import com.electroshop.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> listAllProducts(){
        return productRepository.findAll();
    }
    public Optional<ProductModel> searchById(UUID id){
        return productRepository.findById(id);
    }
    public ProductModel save(ProductModel productModel){
        return productRepository.save(productModel);
    }
    public void delete(UUID id){
        productRepository.deleteById(id);
    }

}
