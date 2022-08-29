package com.examcenter.service;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Service;

import com.examcenter.entity.Exam;
import com.examcenter.entity.Staff;
import com.examcenter.entity.Student;

@Service
public interface StaffService {
public String adddet(Staff s);

public String updatedet(Staff ad);
public List<Student> showStud(String name);
public String addResult(Result rs) ;
public String addExam(Exam ex);
public String addStud(Student s);
public List<Staff> alldet();

}

