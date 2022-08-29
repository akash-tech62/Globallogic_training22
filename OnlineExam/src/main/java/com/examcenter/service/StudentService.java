package com.examcenter.service;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Service;

import com.examcenter.entity.Exam;
import com.examcenter.entity.Student;

@Service
public interface StudentService {
public List<Student>showdet();
public List<Result> showres();
public List<Exam> viewexam();
public String attemptexam(int id);
public String adddet(Student s);

}