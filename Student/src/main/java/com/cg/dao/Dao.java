package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.cg.bean.Student;
import com.cg.exception.StudentException;





@Repository
public class Dao implements Idao {
	
	
	
	
	
	@Autowired
	MongoTemplate mongotemplate;

	@Override		
	public void addStudent(Student s) {
		
		
		mongotemplate.save(s);
			
	}

	@Override		
	public Student read(int id) {
		Student s;

		s = mongotemplate.findById(id, Student.class);
		
		if (s == null)
			throw new StudentException("Student not found with " + id);
		else
			return s;
		
	
	}
	
	
	
	List<Student> studentlist=new ArrayList<Student>();
	@Override
	public List<Student> getAll() {
	studentlist=mongotemplate.findAll(Student.class);
	
	
	if (studentlist.size() == 0)
		throw new StudentException("Student List Empty!! ");
	else
		return studentlist;
	}



	
	
	
	@Override
	public Student uPdate(int id, String name) {
		Student s;
		s= mongotemplate.findById(id, Student.class);
		if (s == null)
			throw new StudentException("StudentId Doesn't Exist Bro...!! ");
		
		else
		s.setName(name);
		mongotemplate.save(s);
		
	
		return s;
	}

	@Override
	public Student delete(int id) {
		Student s;
		s= mongotemplate.findById(id, Student.class);
		if (s == null)
			throw new StudentException("StudentId Doesn't Exist Bro...!! ");
		
		else
		mongotemplate.remove(s);
		return s;
	}
	
	

}
