package com.xh.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {

    private Object target = null;//真实对象

    /**
     * 建立真实对象和代理对象之间的关系
     * @param target
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 执行代理方法
     * @param proxy
     * @param method
     * @param args
     * @return
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");
        Object result = method.invoke(target, args);
        System.out.println("在调度真实对象之后的服务");
        return null;
    }
}
