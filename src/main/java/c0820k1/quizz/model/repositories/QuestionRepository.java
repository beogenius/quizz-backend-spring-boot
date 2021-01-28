package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
