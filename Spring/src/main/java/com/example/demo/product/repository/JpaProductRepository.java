package com.example.demo.product.repository;

import com.example.demo.product.controller.entitiy.JpaProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<JpaProduct, Long> {

}
