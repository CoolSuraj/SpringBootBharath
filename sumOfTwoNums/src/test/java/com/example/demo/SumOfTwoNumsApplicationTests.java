package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.Calculator;

@SpringBootTest
class SumOfTwoNumsApplicationTests {

	@Autowired
	Calculator service;

	@Test
	void testSumOfTwo() {
		assertNotNull(service);
		assertEquals(9, service.sumOfTwo(3, 6));
	}

}
