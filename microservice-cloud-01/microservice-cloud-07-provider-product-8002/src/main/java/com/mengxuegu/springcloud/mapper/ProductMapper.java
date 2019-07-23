package com.mengxuegu.springcloud.mapper;

import java.util.List;

public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
