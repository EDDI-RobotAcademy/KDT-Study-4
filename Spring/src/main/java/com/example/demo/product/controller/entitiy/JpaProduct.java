package com.example.demo.product.controller.entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class JpaProduct {
    private String categoryId;
}
