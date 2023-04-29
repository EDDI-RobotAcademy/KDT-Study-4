package com.example.demo.product.service;

import com.example.demo.product.entity.JpaProduct;
import com.example.demo.product.foam.RequestProductForm;
import com.example.demo.product.repository.JpaProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class JpaProductServiceImpl implements JpaProductService{

    final private JpaProductRepository productRepository;
    @Override
    public List<JpaProduct> find(String categoryId){
          return productRepository.findByCategoryIdLike(categoryId);

    }

    @Override
    public JpaProduct modify(Long productId, RequestProductForm requestProductForm) {
        Optional<JpaProduct> maybeJpaProduct = productRepository.findById(productId);

        if (maybeJpaProduct.isEmpty()) {
            log.info("정보가 없습니다!");
            return null;
        }

        JpaProduct product = maybeJpaProduct.get();
        product.setProductName(requestProductForm.getProductName());
        product.setProductDetails(requestProductForm.getProductDetails());

        return productRepository.save(product);
    }

}
