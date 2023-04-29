package com.example.demo.product.service;

import com.example.demo.product.entity.JpaProduct;
import com.example.demo.product.foam.RequestProductForm;

import java.util.List;

public interface JpaProductService {
    //List<JpaProduct> find(String categoryId, RequestProductFoam requestProductFoam);

    List<JpaProduct> find(String categoryId);

    JpaProduct modify(Long productId, RequestProductForm requestProductForm);
}
