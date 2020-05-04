package com.example.demo.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Question {
    @Id
    private Integer id;
    private String question;
    private String answer;
    private String score;
}
