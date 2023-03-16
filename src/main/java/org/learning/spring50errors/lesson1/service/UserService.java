package org.learning.spring50errors.lesson1.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-02-07
 */
@Service
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserService {

    private String serviceName;

//    // 非Spring场景使用Spring Bean导致注入失败
//    public UserServiceImpl(String serviceName) {
//        this.serviceName = serviceName;
//    }
//
//    // 多个构造函数导致Bean实例化失败
//    public UserServiceImpl(String serviceName, String args1) {
//        this.serviceName = serviceName;
//    }
}
