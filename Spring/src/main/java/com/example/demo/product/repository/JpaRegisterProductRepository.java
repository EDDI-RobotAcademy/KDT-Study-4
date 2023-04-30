package com.example.demo.product.repository;

import com.example.demo.product.entity.JpaProduct;
import com.example.demo.product.entity.JpaRegisterProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaRegisterProductRepository extends JpaRepository<JpaRegisterProduct, Long> {
}
