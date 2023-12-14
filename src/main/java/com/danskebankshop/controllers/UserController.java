package com.danskebankshop.controllers;

import com.danskebankshop.model.User;
import com.danskebankshop.services.UserService;
import com.danskebankshop.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/user")
public class UserController {


    private IUserService userService;

   @Autowired
    public UserController(final UserService userService){
       this.userService = userService;
   }

   @PostMapping("/adduer")
    public void createUser(@RequestBody User user){
       this.userService.addUser(user);
   }

   @GetMapping("all")
    public List<User> getAllUser(){
       return  null;
   }

   @GetMapping("byname/{name}")
    public Optional<User> getByName(@PathVariable("name") String name ) {
       return  this.userService.getUser(name);
   }
}
