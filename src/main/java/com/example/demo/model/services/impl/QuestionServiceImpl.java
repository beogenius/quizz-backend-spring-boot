package com.example.demo.model.services.impl;

import com.example.demo.model.entities.Question;
import com.example.demo.model.repositories.QuestionRepository;
import com.example.demo.model.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        questionRepository.deleteById(id);
        return true;
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }
}
