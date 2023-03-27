package org.learning.spring50errors.lesson5.service;

import lombok.extern.slf4j.Slf4j;
import org.learning.spring50errors.lesson5.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-21
 */
@Slf4j
@Service
public class UserService {

    public final User user = createUser("lizhiyong", "330060");

    public void login() {
        log.info("{}-{} login success", user.getUsername(), user.getPayNum());
    }

    public User getUser() {
        return user;
    }

    private User createUser(String username, String payNum) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPayNum(payNum);
        return newUser;
    }
}
