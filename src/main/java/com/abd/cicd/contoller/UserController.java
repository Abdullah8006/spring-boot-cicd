package com.abd.cicd.contoller;

import com.abd.cicd.model.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public List<UserModel> getUsers() {
        UserModel user = new UserModel("Abdullah", 34, "Software Developer");

        return Arrays.asList(user);
    }
}
