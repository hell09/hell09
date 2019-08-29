package com.hell09.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * hello world!!!
 * 
 * @author Fayes
 * @date 2018年11月21日 下午2:16:45
 */

public class JdkInvocationHandler implements InvocationHandler {

    private ProductService target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }

    public Object getInstance(ProductService target) {
        this.target = target;
        Class<? extends ProductService> clazz = this.target.getClass(); //  <? extends T>只能取,  <? super T>只能存
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

}
