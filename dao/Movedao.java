package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Cinema;

@Mapper
public interface Movedao {
	public List<Cinema> getCinema();
	
		

}
