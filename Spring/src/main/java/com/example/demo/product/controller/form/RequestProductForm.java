package com.example.demo.product.controller.form;

import com.example.demo.product.entity.JpaProduct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RequestProductForm {
    final private String productName;
    final private Integer productPrice;
    final private String manufacturer;
    final private String mfgDate;
    final private String expDate;
    final private String categoryName;
    final private String ProductDetails;

    public JpaProduct toProductEntity() {
        return new JpaProduct(productName, productPrice, manufacturer, mfgDate,
                expDate, categoryName, ProductDetails);
    }
}
