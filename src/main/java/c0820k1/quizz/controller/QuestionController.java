package c0820k1.quizz.controller;

import c0820k1.quizz.model.entities.Question;
import c0820k1.quizz.model.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/question/api")
@CrossOrigin(origins = "*")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    Response res = new Response();

    @GetMapping()
    public Response getAll(){
        List<Question> questionList = questionService.getAll();
        res.data = questionList;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @GetMapping("user")
    public Response getQuestion(@RequestParam Integer id){
        res.data = questionService.findById(id);
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @PostMapping("/create")
    public Response save(@RequestBody Question q){
        Question question = questionService.save(q);
        res.data = question;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @DeleteMapping()
    public Response delete(@RequestParam Integer id){
        Question question = questionService.delete(id);
        res.data = question;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @PutMapping("/update")
    public Response update(@RequestBody Question q){
        Question question = questionService.save(q);
        res.data = question;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }
}
