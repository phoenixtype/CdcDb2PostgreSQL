package dev.phoenixtype.cdcdb2postgresql.repository;

import dev.phoenixtype.cdcdb2postgresql.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
