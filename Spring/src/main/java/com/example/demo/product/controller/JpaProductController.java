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

    @GetMapping("/{categoryId}")
    public List<JpaProduct> productCategoryList(@PathVariable("categoryId") String categoryId){
        List<JpaProduct> returFinedProductList= productService.find(categoryId);
        log.info("categoryId: " + categoryId);
        return returFinedProductList;
    }
    @PutMapping("/{productId}")
    public JpaProduct modifyProduct (@PathVariable("productId") Long productId,
                                 @RequestBody RequestProductForm requestProductForm) {
        log.info("modifyBoard(): " + requestProductForm + ", id: " + productId);

        return productService.modify(productId, requestProductForm);
    }

}