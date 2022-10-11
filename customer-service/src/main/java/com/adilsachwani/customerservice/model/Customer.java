package com.adilsachwani.customerservice.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Customer {

    private Long id;
    private String name;
    private String email;

}
