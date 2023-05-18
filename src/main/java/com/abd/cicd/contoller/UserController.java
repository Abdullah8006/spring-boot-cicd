package com.abd.cicd.contoller;

import com.abd.cicd.model.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public List<UserModel> getUsers(@RequestParam(required = false) Integer id) {
        UserModel user;
        if(id != null){
            user = new UserModel("Inam", id, "Software Developer");
        } else {
            user = new UserModel("Abdullah", 37, "Software Developer");
        }
        return Arrays.asList(user);
    }
}
