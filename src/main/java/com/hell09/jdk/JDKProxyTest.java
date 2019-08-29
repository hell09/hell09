package com.hell09.jdk;

import java.io.FileOutputStream;

import sun.misc.ProxyGenerator;

/**
 * hello world!!!
 * 
 * @author Fayes
 * @date 2018年11月21日 下午2:22:08
 */

public class JDKProxyTest {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        ProductService proxy = (ProductService) new JdkInvocationHandler().getInstance(productService);
        proxy.addProduct("iphone");

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] { productService.getClass() });
        FileOutputStream os;
        try {
            os = new FileOutputStream("Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("game over!");
    }
}
