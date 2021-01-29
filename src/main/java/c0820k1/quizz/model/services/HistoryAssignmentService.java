package c0820k1.quizz.model.services;

import c0820k1.quizz.model.entities.Exam;
import c0820k1.quizz.model.entities.HistoryAssignment;
import c0820k1.quizz.model.entities.User;

import java.util.List;

public interface HistoryAssignmentService extends CommonService<HistoryAssignment> {
    List<HistoryAssignment> findAllByUser(User user);
}
