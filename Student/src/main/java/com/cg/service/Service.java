package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bean.Student;
import com.cg.dao.Idao;





@org.springframework.stereotype.Service
public class Service implements IService {

	
	@Autowired
	Idao dao;
	
	
	@Override
	public void addStudent(Student s) {
		dao.addStudent(s);
		
		
	}


	@Override
	public Student read(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}


	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}


	@Override
	public Student update(int id, String name) {
		// TODO Auto-generated method stub
		return dao.uPdate(id, name);
	}


	@Override
	public Student delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}


	

}
