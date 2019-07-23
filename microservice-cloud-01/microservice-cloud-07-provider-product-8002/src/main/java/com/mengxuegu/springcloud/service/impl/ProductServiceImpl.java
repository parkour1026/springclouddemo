package com.mengxuegu.springcloud.service.impl;

import com.mengxuegu.springcloud.mapper.Product;
import com.mengxuegu.springcloud.mapper.ProductMapper;
import com.mengxuegu.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public Product get(Long pid) {
        return productMapper.findById(pid);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }
}
