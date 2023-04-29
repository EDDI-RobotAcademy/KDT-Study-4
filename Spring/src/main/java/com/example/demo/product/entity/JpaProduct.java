package com.example.demo.product.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class JpaProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    
    private String productName;
    private Integer productPrice;
    private String manufacturer;
    private String mfgDate;
    private String expDate;
    private String categoryId;
    private String productDetails;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    @CreationTimestamp
    private LocalDateTime createDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    @UpdateTimestamp
    private LocalDateTime updateDate;
    
    public JpaProduct(
            String productName,
            Integer productPrice,
            String mfgDate,
            String expDate,
            String productDetails) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.productDetails = productDetails;
    }
}
