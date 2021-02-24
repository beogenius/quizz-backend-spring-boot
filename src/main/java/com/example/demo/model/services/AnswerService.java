package com.example.demo.model.services;


import com.example.demo.model.entities.Answer;

import java.util.List;

public interface AnswerService extends CommonService<Answer>{
    List<Answer> saveAll(List<Answer> answerList);
}
