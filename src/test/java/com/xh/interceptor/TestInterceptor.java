package com.xh.interceptor;


import com.xh.jdkproxy.HelloWorld;
import com.xh.jdkproxy.HelloWorldImpl;
import org.junit.Test;

public class TestInterceptor {

    @Test
    public void testInterceptor(){
        HelloWorld obj = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "com.xh.interceptor.MyInterceptor");
        obj.sayHelloWorld();
    }

    @Test
    public void multiInterceptor(){
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "com.xh.interceptor.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(proxy1, "com.xh.interceptor.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(proxy2, "com.xh.interceptor.Interceptor3");
        proxy3.sayHelloWorld();
    }
}
