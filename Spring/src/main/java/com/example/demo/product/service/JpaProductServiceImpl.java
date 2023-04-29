package com.example.demo.product.service;

import com.example.demo.product.entity.JpaProduct;
import com.example.demo.product.repository.JpaProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class JpaProductServiceImpl implements JpaProductService{

    final private JpaProductRepository productRepository;
    @Override
    public List<JpaProduct> find(String categoryId){
          return productRepository.findByCategoryIdLike(categoryId);

    }

}
