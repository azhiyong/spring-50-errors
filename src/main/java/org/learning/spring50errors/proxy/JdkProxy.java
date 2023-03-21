package org.learning.spring50errors.proxy;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-20
 */
@Slf4j
public class JdkProxy {

    public static void main(String[] args) throws IOException {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloInvocationHandler invocationHandler = new HelloInvocationHandler(new HelloServiceImpl());
        HelloService helloService = (HelloService) Proxy.newProxyInstance(HelloService.class.getClassLoader(), new Class[]{HelloService.class}, invocationHandler);
        helloService.hello();

//        byte[] proxyClassBytes = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{HelloService.class});
//        String targetPath = JdkProxy.class.getClassLoader().getResource(".").getPath();
//        File file = new File(targetPath + "/org/learning/spring50errors/proxy/$Proxy.class");
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        fileOutputStream.write(proxyClassBytes);
//        fileOutputStream.flush();
//        fileOutputStream.close();
    }
}

@Slf4j
class HelloInvocationHandler implements InvocationHandler {

    private HelloService helloService;

    public HelloInvocationHandler(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("{} {} before invoke method:{}", this.helloService, proxy, method.getName());
        Object obj = method.invoke(helloService, args);
        log.info("after invoke method: {}", method.getName());
        return obj;
    }
}
