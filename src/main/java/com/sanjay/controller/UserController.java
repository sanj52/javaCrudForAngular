package com.sanjay.controller;

import com.sanjay.model.User;
import com.sanjay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/addUser")
    public User create(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.getOne(id);
    }

    @PutMapping("/updateUser")
    public User update(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public void delete(@PathVariable("id") int id) {
        userService.deleteById(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
