package c0820k1.quizz.controller.admin.req;


import c0820k1.quizz.model.entities.Answer;
import c0820k1.quizz.model.entities.Question;

import java.util.List;

public class QandA {
    private Question question;
    private List<Answer> answerList;

    public QandA() {
    }

    public QandA(Question question, List<Answer> answerList) {
        this.question = question;
        this.answerList = answerList;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
