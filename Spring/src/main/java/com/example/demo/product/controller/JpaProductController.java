package com.example.demo.product.controller;

import com.example.demo.product.controller.form.RequestProductForm;
import com.example.demo.product.entity.JpaProduct;
import com.example.demo.product.service.JpaProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/jpa-product")
public class JpaProductController {

    final private JpaProductService productService;

    @GetMapping("/{productId}")
    public JpaProduct readProduct (@PathVariable("boardId") Long productId) {
        log.info("boardRead()");

        return productService.read(productId);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct (@PathVariable("boardId") Long productId,
                               @RequestBody RequestProductForm requestProductForm) {
        log.info("productRead()");

        productService.delete(productId);
    }
}
