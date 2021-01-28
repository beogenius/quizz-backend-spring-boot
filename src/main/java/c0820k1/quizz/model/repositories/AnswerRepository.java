package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
