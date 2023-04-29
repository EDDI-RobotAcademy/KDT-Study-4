package com.example.demo.product.controller;

import com.example.demo.product.entity.JpaProduct;
import com.example.demo.product.foam.RequestProductForm;
import com.example.demo.product.service.JpaProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/jpa-product")
public class JpaProductController {

    final private JpaProductService productService;

    @GetMapping("/{productId}")
    public JpaProduct readProduct (@PathVariable("productId") Long productId) {
        log.info("readProduct()");

        return productService.read(productId);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct (@PathVariable("productId") Long productId) {
        log.info("deleteProduct()");

        productService.delete(productId);
    }

    @GetMapping("/{categoryId}")
    public List<JpaProduct> productCategoryList(@PathVariable("categoryId") String categoryId){
        List<JpaProduct> returFinedProductList= productService.find(categoryId);
        log.info("categoryId: " + categoryId);
        return returFinedProductList;
    }

}
