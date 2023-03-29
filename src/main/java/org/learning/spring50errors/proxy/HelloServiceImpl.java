package org.learning.spring50errors.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-21
 */
@Slf4j
class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        log.info("hello service impl");
        this.justHello();
    }

    public void justHello() {
        log.info("just hello in HelloServiceImpl");
    }
}
