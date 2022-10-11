package com.adilsachwani.customerservice.controller;

import com.adilsachwani.customerservice.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable(name = "id") Long id){
        return getStubListOfCustomer().stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    private List<Customer> getStubListOfCustomer(){
        return List.of(
                Customer.builder()
                        .id(23L)
                        .name("Adil Sachwani")
                        .email("adilsachwani@gmail.com")
                        .build(),
                Customer.builder()
                        .id(26L)
                        .name("Naveed Raza")
                        .email("naveedraza@gmail.com")
                        .build(),
                Customer.builder()
                        .id(27L)
                        .name("Najm us Saqib")
                        .email("najmussaqib@gmail.com")
                        .build()
        );
    }

}
