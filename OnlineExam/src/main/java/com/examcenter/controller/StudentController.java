package com.examcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examcenter.entity.Student;
import com.examcenter.service.ExamService;
import com.examcenter.service.ResultService;
import com.examcenter.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	ExamService exs;
	@Autowired
	ResultService reser;	
	@Autowired
	StudentService stdr;
	
	@GetMapping("/")
	public List<Student> show(){
	return	stdr.showdet();
	}
}
