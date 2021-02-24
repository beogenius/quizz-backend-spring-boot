package com.example.demo.model.services.impl;

import com.example.demo.model.entities.Exam;
import com.example.demo.model.repositories.ExamRepository;
import com.example.demo.model.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public boolean delete(int id) {
        if(findById(id) != null){
            return false;
        }
        examRepository.deleteById(id);
        return true;
    }

    @Override
    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }
}
