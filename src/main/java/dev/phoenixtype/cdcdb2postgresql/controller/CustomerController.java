package dev.phoenixtype.cdcdb2postgresql.controller;


import dev.phoenixtype.cdcdb2postgresql.model.Customer;
import dev.phoenixtype.cdcdb2postgresql.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }
}
