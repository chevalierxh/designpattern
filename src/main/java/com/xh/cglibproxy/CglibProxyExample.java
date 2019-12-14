package com.xh.cglibproxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyExample implements MethodInterceptor {

    /**
     * 生成cglib代理对象
     * @param cls 实例类
     * @return
     */
    public Object getProxy(Class cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param proxy 代理对象
     * @param method 方法
     * @param args 方法参数
     * @param methodProxy 方法代理
     * @return
     */
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("调用真实对象后");
        return result;
    }
}
