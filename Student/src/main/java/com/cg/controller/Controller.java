package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Student;
import com.cg.service.IService;






@RestController
public class Controller {
	@Autowired
	IService service;
	
	
	
	
	
	
	@PostMapping(path="/create")
	public String createData(@RequestBody Student s)
	{
		service.addStudent(s);
		return "SUCCESS";
	}
	
	
	
	@GetMapping(path = "read/{id}")
	public Student read(@PathVariable("id")int id)
	{
		Student s = service.read(id);
		System.out.println(s);
		return s;
	}
	
	@GetMapping(path="/getall")
	public List<Student> readData()
	{
		return service.getAll();
		
		
		
	}
	
	
			
	@GetMapping(path = "update/{id}/{name}")
	public Student update(@PathVariable("id")int id, @PathVariable("name") String name)
	{
		Student s = service.update(id, name);
		System.out.println(s);
		return s;
	}
	
	
	@GetMapping(path = "delete/{id}")
	public Student delete(@PathVariable("id")int id)
	{
		Student s = service.delete(id);
		System.out.println(s);
		return s;
	}
	
	
	
	
	
	
	

}
