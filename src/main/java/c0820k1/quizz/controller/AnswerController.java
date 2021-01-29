package c0820k1.quizz.controller;

import c0820k1.quizz.model.entities.Answer;
import c0820k1.quizz.model.entities.Question;
import c0820k1.quizz.model.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/answer/api")
@CrossOrigin(origins = "*")
public class AnswerController {
    @Autowired
    AnswerService answerService;
    Response res = new Response();

    @GetMapping()
    public Response getAll(){
        List<Answer> answerList = answerService.getAll();
        res.data = answerList;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @GetMapping("answer")
    public Response getAnswer(@RequestParam Integer id){
        res.data = answerService.findById(id);
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @PostMapping("/create")
    public Response save(@RequestBody Answer a){
        Answer answer = answerService.save(a);
        res.data = answer;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @DeleteMapping()
    public Response delete(@RequestParam Integer id){
        Answer answer = answerService.delete(id);
        res.data = answer;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }

    @PutMapping("/update")
    public Response update(@RequestBody Answer a){
        Answer answer = answerService.save(a);
        res.data = answer;
        res.status = res.SUCCESS;
        res.message = "Success";
        return res;
    }
}
