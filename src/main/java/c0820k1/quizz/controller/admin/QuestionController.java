package c0820k1.quizz.controller.admin;

import c0820k1.quizz.controller.admin.req.QandA;
import c0820k1.quizz.model.entities.Answer;
import c0820k1.quizz.model.entities.Question;
import c0820k1.quizz.model.services.AnswerService;
import c0820k1.quizz.model.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/question")
public class QuestionController {
    @Autowired
    private QuestionService questionSv;



    @Autowired
    private AnswerService answerSv;

    @GetMapping
    public List<Question> getAll(){
        return questionSv.getAll();
    }

    @GetMapping("/{id}")
    public Question findById(@PathVariable("id")int id){
        return questionSv.findById(id);
    }

    @PostMapping("/create")
    public Question create(@RequestBody QandA qandA){
        Question q = questionSv.save(qandA.getQuestion());
        List<Answer> answerList = qandA.getAnswerList();

        for (Answer a : answerList) {
            a.setQuestion_id(q.getId());
        }

        answerSv.saveAll(answerList);

        return q;
    }

//    @PutMapping("/update")
//    public Question update(@RequestBody QandA qandA){
//        List<Answer> answerList = qandA.getAnswerList();
//
//    }

}
