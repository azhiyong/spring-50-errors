package org.learning.spring50errors.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-21
 */
@Slf4j
public class CglibProxy {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                log.info("intercept {},{},{}", o, method, methodProxy.getSuperName());
                return methodProxy.invokeSuper(o, objects);
            }
        });
        HelloService helloService = (HelloService) enhancer.create();
        helloService.hello();
    }

}
