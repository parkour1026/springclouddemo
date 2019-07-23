package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.mapper.Product;

import java.util.List;

public interface ProductService {
    Product get(Long pid);
    List<Product> list();
    boolean add(Product product);
}
