package com.yaqin.conferencemvc.controller;

import com.yaqin.conferencemvc.model.Registration;
import com.yaqin.conferencemvc.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getRegistration(@RequestParam(value="firstname", defaultValue = "Yaqin") String firstname,
                                @RequestParam(value="firstname", defaultValue = "Wang") String lastname,
                                @RequestParam(value="age", defaultValue = "23") int age){
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);
        return user;
    }

    @PostMapping("user")
    public User postUser(User user){
        System.out.println("User firstname:"+user.getFirstname());
        return user;
    }

}
