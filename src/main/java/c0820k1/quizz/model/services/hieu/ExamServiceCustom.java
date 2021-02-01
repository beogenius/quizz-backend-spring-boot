package c0820k1.quizz.model.services.hieu;

import c0820k1.quizz.model.entities.Exam;
import c0820k1.quizz.model.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamServiceCustom implements IExamService {
    @Autowired
    private ExamRepository examRepository;

    @Override
    public Iterable<Exam> findAll() {
        return examRepository.findAll();
    }

    @Override
    public Optional<Exam> findById(int id) {
        return examRepository.findById(id);
    }

    @Override
    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public void remove(int id) {
        examRepository.deleteById(id);
    }
}
