package com.examcenter.serviceImpl;


import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examcenter.entity.Admin;
import com.examcenter.entity.Exam;
import com.examcenter.entity.Student;
import com.examcenter.repo.AdminRepo;
import com.examcenter.repo.StaffRepo;
import com.examcenter.service.AdminService;
import com.examcenter.service.ExamService;
import com.examcenter.service.ResultService;
import com.examcenter.service.StudentService;

@Component
public class Adminimpl implements AdminService{
@Autowired
AdminRepo adr;

@Autowired
StaffRepo stadr;

@Autowired
StudentService stdr;

@Autowired
ExamService exrr;

@Autowired
ResultService resr;

	@Override
	public String adddet(Admin ad) {
		adr.save(ad);
		return "Data addedd Successfully";
	}

	@Override
	public List<Result> addResult() {
		
		return resr.alldet();
	}

	@Override
	public String addExam(Exam ex) {
		exrr.adddet(ex);
		return "Details added Sucessfully";
	}

	@Override
	public String addStud(Student s) {
		stdr.adddet(s);
		return "Data addedd Sucessfully";
	}

	@Override
	public List<Admin> alldet() {
		
		return adr.findAll();
	}

}
