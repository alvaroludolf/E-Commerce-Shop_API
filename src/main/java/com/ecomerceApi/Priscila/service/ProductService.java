package com.ecomerceApi.Priscila.service;

import com.ecomerceApi.Priscila.model.Product;
import com.ecomerceApi.Priscila.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public Product addNewProduct(Product product) {
        return productRepository.save(product);

    }

}
