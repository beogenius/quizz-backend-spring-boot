package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.HistoryAssignment;
import c0820k1.quizz.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

 }
