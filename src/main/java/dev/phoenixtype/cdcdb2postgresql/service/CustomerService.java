package dev.phoenixtype.cdcdb2postgresql.service;

import dev.phoenixtype.cdcdb2postgresql.model.Customer;
import dev.phoenixtype.cdcdb2postgresql.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }
}
