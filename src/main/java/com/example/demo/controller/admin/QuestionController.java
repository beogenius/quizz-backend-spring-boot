package com.example.demo.controller.admin;

import com.example.demo.model.services.AnswerService;
import com.example.demo.model.services.QuestionService;
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


}
