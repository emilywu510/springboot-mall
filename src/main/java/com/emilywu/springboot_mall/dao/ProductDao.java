package com.emilywu.springboot_mall.dao;

import com.emilywu.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
