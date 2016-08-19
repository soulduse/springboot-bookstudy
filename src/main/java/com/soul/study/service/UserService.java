package com.soul.study.service;

import com.soul.study.domain.User;
import com.soul.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sould on 2016-08-19.
 */

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findOne(int id){
        return userRepository.findOne(id);
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void delete(int id){
        userRepository.delete(id);
    }
}
