package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.course;

@Component
public interface courseDao
{
	@Select("select * from course where id=#{id}")
	public course getById(@Param("id") Long id);
}
