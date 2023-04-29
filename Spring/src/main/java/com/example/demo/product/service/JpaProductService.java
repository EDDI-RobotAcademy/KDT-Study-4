package com.example.demo.product.service;

import com.example.demo.product.entity.JpaProduct;

import java.util.List;

public interface JpaProductService {

    List<JpaProduct> list();

    JpaProduct read(Long productId);

    void delete(Long productId);

}
