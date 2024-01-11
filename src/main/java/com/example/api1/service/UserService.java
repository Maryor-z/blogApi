package com.example.api1.service;

import com.example.api1.api.controller.UserController;
import com.example.api1.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Maryor", 32, "maryor@gmail.com");
        User user2 = new User(2, "WHo", 33, "kdvbkd@hmail.com");
        User user3 = new User(3, "David", 53, "davee@hmail.com");
        User user4 = new User(4, "Eva", 20, "eva@hmail.com");
        User user5 = new User(5, "June", 33, "kdvbkd@hmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));

    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
