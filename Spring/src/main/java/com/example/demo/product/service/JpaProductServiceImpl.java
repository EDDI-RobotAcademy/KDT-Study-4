package com.example.demo.product.service;

import com.example.demo.product.controller.entitiy.JpaProduct;
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
        //todo: 어떻게 categoryId를 찾아서 반환할 것인지 생각해야함
        productRepository.findById(Long.valueOf(categoryId))
        return null;
    }



}
