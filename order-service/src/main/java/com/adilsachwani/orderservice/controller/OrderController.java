package com.adilsachwani.orderservice.controller;

import com.adilsachwani.orderservice.dto.OrderDto;
import com.adilsachwani.orderservice.model.Customer;
import com.adilsachwani.orderservice.model.Order;
import com.adilsachwani.orderservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public OrderDto getOrderById(@PathVariable(name = "id") Long id){
        return getStubListOfOrder().stream()
                .filter(order -> order.getId().equals(id))
                .findFirst()
                .map(order -> {
                    Customer customer = restTemplate.getForObject("http://customer-service:8082/api/customer/" + order.getCustomerId(), Customer.class);
                    Product product = restTemplate.getForObject("http://product-service:8081/api/product/" + order.getProductId(), Product.class);
                    return OrderDto.builder()
                            .id(order.getId())
                            .customerName(customer.getName())
                            .productName(product.getTitle())
                            .quantity(order.getQuantity())
                            .build();
                })
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public List<Order> getStubListOfOrder(){
        return List.of(
                Order.builder()
                        .id(1L)
                        .customerId(26L)
                        .productId(1L)
                        .quantity(2)
                        .build(),
                Order.builder()
                        .id(2L)
                        .customerId(23L)
                        .productId(2L)
                        .quantity(1)
                        .build()
        );
    }

}
