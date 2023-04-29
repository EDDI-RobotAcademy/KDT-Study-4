package com.example.demo.product.foam;

import com.example.demo.product.entity.JpaProduct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RequestProductForm {
    final private String categoryId;
    final private Long productId;

    public JpaProduct toJPaProduct(){
        return new JpaProduct(categoryId);
    }
}
