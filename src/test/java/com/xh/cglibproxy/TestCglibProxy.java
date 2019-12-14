package com.xh.cglibproxy;

import org.junit.Test;

public class TestCglibProxy {

//    public static void main(String[] args) {
//        CglibProxyExample cglib = new CglibProxyExample();
//        ReflectServiceImpl obj = (ReflectServiceImpl) cglib.getProxy(ReflectServiceImpl.class);
//        obj.sayHello("张三");
//    }

    @Test
    public void testCglibProxy(){
        CglibProxyExample cglib = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl) cglib.getProxy(ReflectServiceImpl.class);
        obj.sayHello("李四");
    }
}
