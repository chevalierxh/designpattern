package com.xh.interceptor;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {

    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法前调用");
        return false;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("取代了被代理对象的方法");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后调用");
    }
}
