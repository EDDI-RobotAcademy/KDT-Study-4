package com.example.demo.product.service;

import com.example.demo.product.entity.JpaProduct;

import java.util.List;

public interface JpaProductService {
    //List<JpaProduct> find(String categoryId, RequestProductFoam requestProductFoam);

    List<JpaProduct> find(String categoryId);

}
