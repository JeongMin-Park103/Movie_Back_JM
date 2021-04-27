package com.example.demo.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Cinema;

import io.swagger.annotations.ApiOperation;


//http://localhost:8080/swagger-ui.html#/
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/yeme")
public class Moviecontroller {
   
   @Autowired
   private com.example.demo.service.Moveservice Moveservice;

   @ApiOperation(value = "모든 영화 목록", notes = "모든 영화 목록을 불러온다")
   @GetMapping("/movies")
   public ResponseEntity<List<Cinema>> getAllMoives() throws Exception {
      return new ResponseEntity<List<Cinema>>(Moveservice.getCinema(), HttpStatus.OK);
   }
   
  
   
}
