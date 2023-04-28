package com.example.demo.product.service;

import com.example.demo.product.controller.entitiy.JpaProduct;

import java.util.List;

public interface JpaProductService {
    List<JpaProduct> find(String categoryId);
}
