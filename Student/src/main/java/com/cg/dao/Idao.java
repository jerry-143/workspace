package com.cg.dao;

import java.util.List;

import com.cg.bean.Student;

public interface Idao {

	void addStudent(Student s);

	Student read(int id);

	List<Student> getAll();

	Student uPdate(int id, String name);

	Student delete(int id);



}
