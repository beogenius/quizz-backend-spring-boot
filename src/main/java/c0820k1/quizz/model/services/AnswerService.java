package c0820k1.quizz.model.services;

import c0820k1.quizz.model.entities.Answer;

import java.util.List;

public interface AnswerService extends CommonService<Answer>{
    List<Answer> saveAll(List<Answer> answerList);
}
