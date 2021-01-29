package c0820k1.quizz.model.repositories;

import c0820k1.quizz.model.entities.Exam;
import c0820k1.quizz.model.entities.HistoryAssignment;
import c0820k1.quizz.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface HistoryAssignmentRepository extends JpaRepository<HistoryAssignment, Integer> {
    List<HistoryAssignment> findAllByUser(User user );
}
