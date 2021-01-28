package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.User;
import c0820k1.quizz.model.repositories.UserRepository;
import c0820k1.quizz.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public User delete(int id) {
        User user = findById(id);
        userRepository.deleteById(id);
        return user;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
