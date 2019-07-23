package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.mapper.Product;
import com.mengxuegu.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Product product){
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id){
        Product product = productService.get(id);
        if (product==null){
            throw new RuntimeException("ID="+id+"无效");
        }
        return product;
    }

    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    public List<Product> list(){
        return productService.list();
    }

    public Product getFallback(@PathVariable("id") Long id){
        return new Product(id,"ID="+id,"无效数据库");
    }


}
