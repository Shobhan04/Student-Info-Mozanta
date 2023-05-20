package com.student.config;

import java.util.Comparator;

import com.student.entity.Student;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		String n1=o1.getName();
		String n2=o2.getName();
		return n1.compareTo(n2);
	}

}
