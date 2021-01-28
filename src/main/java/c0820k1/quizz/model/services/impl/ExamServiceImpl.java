package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.Exam;
import c0820k1.quizz.model.repositories.ExamRepository;
import c0820k1.quizz.model.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<Exam> getAll() {
        return examRepository.findAll();
    }

    @Override
    public Exam findById(int id) {
        return examRepository.findById(id).get();
    }

    @Override
    public Exam delete(int id) {
        Exam exam = findById(id);
        examRepository.deleteById(id);
        return exam;
    }

    @Override
    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }
}
