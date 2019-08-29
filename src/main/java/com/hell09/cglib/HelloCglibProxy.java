package com.hell09.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * hello world!!!
 * 
 * @author Fayes
 * @date 2018年11月21日 下午3:19:14
 * 
 * proxy和intercepter最好分开
 */

public class HelloCglibProxy implements MethodInterceptor {

    private Object obj;
    
    public Object createProxy(Object target) {
        this.obj = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.obj.getClass());// 设置代理目标
        enhancer.setCallback(this);// 设置回调
        enhancer.setClassLoader(target.getClass().getClassLoader());
        return enhancer.create();
    }
    
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        doBefore(method);
        Object object = methodProxy.invokeSuper(o, objects);
        doAfter(method);
        return object;
    }

    private void doBefore(Method method) {
        System.out.println("before: " + method.getName());
    }

    private void doAfter(Method method) {
        System.out.println("after: " + method.getName());
    }

}
