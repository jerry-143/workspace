package com.cg.service;

import java.util.List;

import com.cg.bean.Student;

public interface IService {

	void addStudent(Student s);

	Student read(int id);

	List<Student> getAll();

	Student update(int id, String name);

	Student delete(int id);

	

}
