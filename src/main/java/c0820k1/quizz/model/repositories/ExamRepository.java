package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,Integer> {
}
