package com.hell09.jdk;

/**
 * hello world!!!
 * 
 * @author Fayes
 * @date 2018年11月21日 下午2:20:36
 */

public class ProductServiceImpl implements ProductService {

    @Override
    public void addProduct(String productName) {
        System.out.println("添加: " + productName);
    }

}
