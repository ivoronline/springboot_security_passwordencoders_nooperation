package com.ivoronline.controller;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //=================================================================
  // ENCODE PASSWORD
  //=================================================================
  @RequestMapping("EncodePassword")
  String encodePassword(@RequestParam String password) {

    //GET PASSWORD ENCODER
    PasswordEncoder passwordEncoder = NoOpPasswordEncoder.getInstance();

    //ENCODE PASSWORD
    String encodedPassword = passwordEncoder.encode(password);

    //RETURN ENCODED PASSWORD
    return encodedPassword;

  }

  //=================================================================
  // HELLO
  //=================================================================
  @RequestMapping("Hello")
  String hello() {
    return "Hello from Controller";
  }

}

