package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.test.temp.TempService;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	TempService tempService;

	@Test
	void contextLoads() {
	}

	@Test
	void errorTest() {
		tempService.getAllDatas();
	}
}
