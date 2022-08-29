package com.examcenter.serviceImpl;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examcenter.entity.Exam;
import com.examcenter.entity.Student;
import com.examcenter.repo.ExamRepo;
import com.examcenter.repo.ResultRepo;
import com.examcenter.repo.StudentRepo;
import com.examcenter.service.StudentService;
@Component
public class Studentserimpl implements StudentService{
@Autowired
StudentRepo str;
@Autowired
ResultRepo resr;
@Autowired 
ExamRepo exr
;

	@Override
	public List<Student> showdet() {
		
		return str.findAll();
	}

	@Override
	public List<Result> showres() {
		// TODO Auto-generated method stub
		return resr.findAll();
	}

	@Override
	public List<Exam> viewexam() {
		// TODO Auto-generated method stub
		return exr.findAll();
	}

	@Override
	public String attemptexam(int id) {
		// TODO Auto-generated method stub
	
		return "Attempting the exam";
	}

	@Override
	public String adddet(Student s) {
		str.save(s);
		return "Data addedd Successfully";
	}
/*
 @Override
	public List<String> showStudentName() {
		
		return str.StudentsByName();
	}*/

}
