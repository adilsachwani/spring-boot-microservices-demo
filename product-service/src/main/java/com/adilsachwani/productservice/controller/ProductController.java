package com.adilsachwani.productservice.controller;

import com.adilsachwani.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable(name = "id") Long id){
        return getStubListOfProduct().stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }


    private List<Product> getStubListOfProduct(){
        return List.of(
                Product.builder()
                        .id(1L)
                        .title("Cac1000 Plus Tab-Orange T 20's")
                        .price(373.0)
                        .build(),
                Product.builder()
                        .id(2L)
                        .title("Abocal Tab Effervescent 10's")
                        .price(196.78)
                        .build(),
                Product.builder()
                        .id(3L)
                        .title("HealthAid Osteovit-D Calcium Plus 30 Tablets")
                        .price(1235.00)
                        .build()
        );
    }

}
