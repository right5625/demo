package com.example.demo;

import com.example.demo.Question.Question;
import com.example.demo.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	QuestionRepository questionRepository;
	@Test
	void test() {
		Question question = new Question();
		question.setSubject("안녕하세요.");
		question.setContent("반갑습니다.");
		question.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question);
	}
}
