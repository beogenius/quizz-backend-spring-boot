package com.example.demo.model.services.impl;

import com.example.demo.model.entities.Answer;
import com.example.demo.model.repositories.AnswerRepository;
import com.example.demo.model.services.AnswerService;
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
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        answerRepository.deleteById(id);
        return true;
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
