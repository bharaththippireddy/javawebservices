package com.bharath.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
