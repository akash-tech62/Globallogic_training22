package com.examcenter.serviceImpl;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired
;
import org.springframework.stereotype.Component;

import com.examcenter.entity.Exam;
import com.examcenter.entity.Staff;
import com.examcenter.entity.Student;
import com.examcenter.repo.StaffRepo;
import com.examcenter.service.ExamService;
import com.examcenter.service.ResultService;
import com.examcenter.service.StaffService;
import com.examcenter.service.StudentService;
@Component
public class Staffservimpl implements StaffService {


@Autowired
StaffRepo stadr;

@Autowired
StudentService stdr;

@Autowired
ExamService exrr;

@Autowired
ResultService resr;




	@Override
	public String adddet(Staff s) {
		stadr.save(s);
		return "Data Added Sucessfully" ;
	}



	@Override
	public String updatedet(Staff ad) {
		stadr.save(ad);
		return  "Data Updated Sucessfully" ;
	}

	@Override
	public List<Student> showStud(String name) {
		
		return stdr.showdet();
	}

	@Override
	public String addResult(Result rs) {
		resr.adddet(rs);
		return "Data of Result is added" ;
	}

	@Override
	public String addExam(Exam ex) {
	exrr.adddet(ex);
		return "Data of Exam is added";
	}

	@Override
	public String addStud(Student s) {
		// TODO Auto-generated method stub\
		stdr.adddet(s);
		return "Data of Sudent is added";
	}

	@Override
	public List<Staff> alldet() {
		// TODO Auto-generated method stub
		return stadr.findAll();
	}

}
