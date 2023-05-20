package com.student.controller;

import org.springframework.stereotype.Service;

@Service
public class IdGenerator {
	
	public String generate() {
		return "R-"+System.currentTimeMillis()%100;
	}

}
