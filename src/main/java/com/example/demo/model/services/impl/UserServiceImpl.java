package com.example.demo.model.services.impl;

import com.example.demo.model.entities.User;
import com.example.demo.model.repositories.UserRepository;
import com.example.demo.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
