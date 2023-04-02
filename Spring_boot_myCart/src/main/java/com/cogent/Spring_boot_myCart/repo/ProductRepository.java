package com.cogent.Spring_boot_myCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.Spring_boot_myCart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
