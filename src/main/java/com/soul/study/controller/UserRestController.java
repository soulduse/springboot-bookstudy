package com.soul.study.controller;

import com.soul.study.domain.User;
import com.soul.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sould on 2016-08-19.
 */
@RestController
@RequestMapping("api/users")
public class UserRestController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    List<User> getUsers(){
        List<User> users = userService.findAll();
        return users;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    User getUser(@PathVariable int id){
        User user = userService.findOne(id);
        return user;
    }

    // 신규고객 정보 작성
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    User postUsers(@RequestBody User user){
        return userService.create(user);
    }

    // 고객 한 명의 정보 업데이트
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    User putUser(@PathVariable int id, @RequestBody User user){
        user.setId(id);
        return userService.update(user);
    }

    // 고객 한 명의 정보 삭제
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteUser(@PathVariable int id){
        userService.delete(id);
    }
}
