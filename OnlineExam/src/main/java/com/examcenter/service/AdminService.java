package com.examcenter.service;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Service;

import com.examcenter.entity.Admin;
import com.examcenter.entity.Exam;
import com.examcenter.entity.Student;

@Service
public interface AdminService {
	
	
public String adddet(Admin ad);

//public List<String> showName();
public List<Result> addResult();
public String addExam(Exam ex);
public String addStud(Student s);
public List<Admin> alldet();
}
