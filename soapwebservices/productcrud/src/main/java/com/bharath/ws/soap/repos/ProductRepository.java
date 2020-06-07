package com.bharath.ws.soap.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.ws.soap.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
