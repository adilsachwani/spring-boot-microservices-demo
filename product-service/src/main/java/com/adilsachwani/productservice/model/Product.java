package com.adilsachwani.productservice.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Product {

    private Long id;
    private String title;
    private Double price;

}
