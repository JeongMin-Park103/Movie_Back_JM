package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Movedao;
import com.example.demo.dto.Cinema;

@Service
public class Moveserviceimpl implements Moveservice{

	@Autowired
	Movedao dao;
	
	@Override
	public List<Cinema> getCinema() {
		// TODO Auto-generated method stub
		return dao.getCinema();
	}

}
