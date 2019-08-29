package com.hell09.cglib;

/**
 * hello world!!!
 * 
 * @author Fayes
 * @date 2018年11月21日 下午2:22:08
 */

public class CGLIBProxyTest {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloCglibProxy cglibProxy = new HelloCglibProxy();
        HelloService hello = (HelloService) cglibProxy.createProxy(helloService);
        hello.sayHello();
        
        System.out.println("game over!");
    }
    
}
