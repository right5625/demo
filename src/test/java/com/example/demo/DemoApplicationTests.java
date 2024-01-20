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
		for (int i = 0; i < 300; i++) {
			Question question = new Question();
			question.setSubject("테스트 데이터" + i);
			question.setContent("내용 없음");
			question.setCreateDate(LocalDateTime.now());
			questionRepository.save(question);
		}
	}
}
