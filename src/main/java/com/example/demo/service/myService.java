package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.courseDao;
import com.example.demo.entity.*;

@Service
public class myService 
{
	@Autowired
	private courseDao cd;
	
	//	List<course> list=new ArrayList<course>();
	public myService()
	{
	//	list.add(new course(123,"XYZ","desc"));
	//list.add(new course(321,"ABC","description"));
	}
	/*
	public List<course> getCourse() 
	{return 
			cd.findAll();
	}*/
	
	public course getbyId(long id) {
		// TODO Auto-generated method stu
		/*course c=null;
		for(course cs:list)
		{
			if(cs.getId()==id)
			{
				c=cs;
				break;
			}
		}
		return c;*/
		return cd.getById(id);
	}
	
	public course addcourse(course c) 
	{
		// TODO Auto-generated method stub
	/*	list.add(c);
		return  list;*/
		//cd.save(c);
		return c;
	}
	
	//public course update(course c) 
	//{
		/*list.forEach(e->
		{
			if(e.getId()==c.getId())
			{
				e.setTitle(c.getTitle());
				e.setDesc(c.getDesc());	
			}
		}
				);
		//list.add(c);
		return list;*/
		//cd.save(c);
		//return c;
		
	//}
	/*
	public void delete(long id) 
	{
		list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
		course e=cd.getById(id);
		cd.delete(e);
	}
	*/
}
