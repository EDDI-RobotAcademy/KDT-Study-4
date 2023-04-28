package com.example.demo.product.controller.entitiy;

import com.example.demo.product.service.JpaProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/jpa-product")
public class JpaProductController {

    final private JpaProductService productService;

    @GetMapping("/CategoryId")
    public List<JpaProduct> productList(){
        List<JpaProduct> returFinedProductList= productService.find(string categoryId);
        return returFinedProductList;
    }
}
