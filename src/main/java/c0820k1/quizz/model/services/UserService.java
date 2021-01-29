package c0820k1.quizz.model.services;

import c0820k1.quizz.model.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends CommonService<User>{
    List<User> getAll();
    User findById(int id);
    User save(User user);
    User delete(int id);

}
