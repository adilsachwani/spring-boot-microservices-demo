package com.adilsachwani.orderservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OrderDto {

    private Long id;
    private String customerName;
    private String productName;
    private Integer quantity;

}
