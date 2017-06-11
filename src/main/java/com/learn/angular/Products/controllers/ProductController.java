package com.learn.angular.Products.controllers;

import com.learn.angular.Products.models.Product;
import com.learn.angular.Products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity(productRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "/products/add", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
