package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    //Hieu
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
}
