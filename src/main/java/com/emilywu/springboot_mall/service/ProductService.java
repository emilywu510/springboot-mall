package com.emilywu.springboot_mall.service;

import com.emilywu.springboot_mall.dto.ProductRequest;
import com.emilywu.springboot_mall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
