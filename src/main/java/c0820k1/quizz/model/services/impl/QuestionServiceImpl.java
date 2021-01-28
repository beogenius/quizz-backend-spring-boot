package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.Question;
import c0820k1.quizz.model.repositories.QuestionRepository;
import c0820k1.quizz.model.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(int id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public Question delete(int id) {
        Question question = findById(id);
        questionRepository.deleteById(id);
        return question;
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }
}
