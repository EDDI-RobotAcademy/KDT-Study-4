package com.example.demo.product.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class JpaProduct {
    @Id
    @GeneratedValue
    private Long productId;
    private String categoryId;

    public JpaProduct(String categoryId) {

        this.categoryId = categoryId;
    }
}
