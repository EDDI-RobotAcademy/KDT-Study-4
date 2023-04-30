package com.example.demo.product.foam;

import com.example.demo.product.entity.JpaRegisterProduct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RegisterRequestProductForm {
    private String productName;
    private Integer productPrice;
    private String manufacturer;
    private String mfgDate;
    private String expDate;
    private String categoryId;
    private String productDetails;

    public JpaRegisterProduct toJPaProduct() {
        return new JpaRegisterProduct(productName, productPrice, manufacturer, mfgDate, expDate, categoryId, productDetails
        );
    }
}
