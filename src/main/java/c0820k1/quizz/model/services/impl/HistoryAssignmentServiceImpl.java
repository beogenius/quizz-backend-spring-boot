package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.Exam;
import c0820k1.quizz.model.entities.HistoryAssignment;
import c0820k1.quizz.model.entities.User;
import c0820k1.quizz.model.repositories.HistoryAssignmentRepository;
import c0820k1.quizz.model.services.HistoryAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoryAssignmentServiceImpl implements HistoryAssignmentService {
    @Autowired
    HistoryAssignmentRepository historyAssignmentRepository;
    @Override
    public List<HistoryAssignment> getAll() {
        return historyAssignmentRepository.findAll();
    }

    @Override
    public HistoryAssignment findById(int id) {
        return historyAssignmentRepository.findById(id).get();
    }

    @Override
    public HistoryAssignment delete(int id) {
        HistoryAssignment historyAssignment = historyAssignmentRepository.findById(id).get();
        return historyAssignment;
    }

    @Override
    public HistoryAssignment save(HistoryAssignment historyAssignment) {
        historyAssignmentRepository.save(historyAssignment);
        return historyAssignment;
    }


    @Override
    public List<HistoryAssignment> findAllByUser(User user) {
        return historyAssignmentRepository.findAllByUser(user);
    }
}
