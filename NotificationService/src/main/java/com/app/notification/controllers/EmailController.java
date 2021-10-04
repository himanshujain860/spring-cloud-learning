package com.app.notification.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @PostMapping("/notification/email/send/")
    public Object sendEmail(@RequestBody String body){
        return ResponseEntity.ok("Email Sent" + body);
    }
}
