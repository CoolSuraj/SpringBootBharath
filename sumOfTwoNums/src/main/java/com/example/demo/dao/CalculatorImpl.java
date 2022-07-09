package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

	@Override
	public int sumOfTwo(int num1,int num2) {
	
		return num1+num2;
	}

}
