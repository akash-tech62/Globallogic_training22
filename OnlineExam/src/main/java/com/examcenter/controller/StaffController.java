package com.examcenter.controller;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examcenter.entity.Exam;
import com.examcenter.entity.Staff;
import com.examcenter.entity.Student;
import com.examcenter.service.ExamService;
import com.examcenter.service.ResultService;
import com.examcenter.service.StaffService;
import com.examcenter.service.StudentService;

@RestController
@RequestMapping("/Staff")
public class StaffController {
	@Autowired
	ExamService exs;
	@Autowired
	ResultService reser;
	@Autowired
	StaffService stafser;
	@Autowired
	StudentService stdr;
	
	
	@GetMapping("/")
	public List<Staff> showalldet(){
		return stafser.alldet();
	}
	
	@PostMapping("/exam")
	public String addexamdet(Exam st) {
		return exs.adddet(st);
	}
	@PostMapping("/result")
	public String addresultdet(Result st) {
		return reser.adddet(st);
	}
	@PostMapping("/student")
	public String addstudentdet(Student st) {
		return stdr.adddet(st);
	}
}