package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.course;
import com.example.demo.service.myService;

@RestController
public class myController 
{
	@Autowired
	private myService ms;

	@RequestMapping("/hi")
	public String hello()
	{
		return("hi");
	}
/*	@GetMapping("/course")
	public List<course> getCourses()
	{
		return null;//this.ms.getCourse();
	}*/
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	@ResponseBody
	public course getbyId(@PathVariable String id)
	{
		return this.ms.getbyId(Long.parseLong(id));
	}
	/*@PostMapping("/course")
	public course adding(@RequestBody course c)
	{
		return null;//ms.addcourse(c);
	}
	
	@PutMapping("/update")
	public course update(@RequestBody course c)
	{
		return null;//this.ms.update(c);
	}*/
	/*
	@DeleteMapping("/course/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable String id)
	{
		try 
		{
			this.ms.delete(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
}
