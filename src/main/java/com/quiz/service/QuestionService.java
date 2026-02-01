package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuestionDao;
import com.quiz.entity.*;
import com.quiz.repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepo;

	public ResponseEntity<List<Question>> getAllQuestions() {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (questionRepo.findAll(),HttpStatus.OK);
	}

	public List<Question> getQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		return questionRepo.findByCategory(category);
	}

	public String addQuestion(Question question) {
		// TODO Auto-generated method stub
		questionRepo.save(question);
		return "success";
		
	}

}
