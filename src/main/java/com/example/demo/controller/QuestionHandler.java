package com.example.demo.controller;


import com.example.demo.entity.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionHandler {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/findAll")
    public List<Question> findAll(){
        return questionRepository.findAll();
    }
}
