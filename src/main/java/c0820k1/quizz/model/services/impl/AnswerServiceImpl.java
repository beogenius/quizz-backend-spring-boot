package c0820k1.quizz.model.services.impl;

import c0820k1.quizz.model.entities.Answer;
import c0820k1.quizz.model.repositories.AnswerRepository;
import c0820k1.quizz.model.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<Answer> getAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer findById(int id) {
        return answerRepository.findById(id).get();
    }

    @Override
    public Answer delete(int id) {
        Answer answer = findById(id);
        answerRepository.deleteById(id);
        return answer;
    }

    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public List<Answer> saveAll(List<Answer> answerList) {
        return answerRepository.saveAll(answerList);
    }
}
