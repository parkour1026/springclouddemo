package com.mengxuegu.springcloud.service.impl;

import com.mengxuegu.springcloud.mapper.Product;
import com.mengxuegu.springcloud.service.ProductClientService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductClientServiceFallBack implements ProductClientService {
    @Override
    public Product get(Long id) {
        return new Product(id,"无效id"+id,"数据库中不存在该id");
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }
}
