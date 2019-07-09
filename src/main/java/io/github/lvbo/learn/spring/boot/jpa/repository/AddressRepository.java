package io.github.lvbo.learn.spring.boot.jpa.repository;

import io.github.lvbo.learn.spring.boot.jpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}