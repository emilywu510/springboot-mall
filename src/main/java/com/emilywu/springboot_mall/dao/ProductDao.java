package com.emilywu.springboot_mall.dao;

import com.emilywu.springboot_mall.dto.ProductRequest;
import com.emilywu.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
