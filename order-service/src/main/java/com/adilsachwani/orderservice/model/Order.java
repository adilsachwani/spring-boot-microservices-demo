package com.adilsachwani.orderservice.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Order {

    private Long id;
    private Long customerId;
    private Long productId;
    private Integer quantity;

}
