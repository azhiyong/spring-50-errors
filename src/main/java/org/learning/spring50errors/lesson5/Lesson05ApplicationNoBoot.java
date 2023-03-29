package org.learning.spring50errors.lesson5;

import org.learning.spring50errors.lesson5.service.ElectricService;
import org.learning.spring50errors.proxy.CglibProxy;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-29
 */
public class Lesson05ApplicationNoBoot {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, CglibProxy.class.getClassLoader().getResource(".").getPath());

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.learning.spring50errors.lesson5");
        applicationContext.start();

        ElectricService electricService = applicationContext.getBean(ElectricService.class);
        electricService.charge();
    }
}
