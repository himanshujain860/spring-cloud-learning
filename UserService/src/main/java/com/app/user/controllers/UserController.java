package com.app.user.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/")
    public Object getUsers(){
        return ResponseEntity.ok(new String[]{"User-1", "User-2"});
    }

    @GetMapping("/account/details")
    public Object getUserDetails(){
        //TODO: call products/user/1 and append in response
        //TODO: call notification/user/1 and append in response
        return ResponseEntity.ok(new String[]{"User-1", "User-2"});
    }

    @PostMapping("/account/details/send")
    public Object sendAccountDetailsEmail(){
        //TODO: call products/user/1 and append in response
        //TODO: call notification/email/send with above response
        return ResponseEntity.ok("SENT SUCCESS");
    }
}
