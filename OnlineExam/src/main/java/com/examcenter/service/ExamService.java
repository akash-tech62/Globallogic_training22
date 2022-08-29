package com.examcenter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examcenter.entity.Exam;

@Service
public interface ExamService {
	public String adddet(Exam e);
	public String updatedet(Exam e);
	public String deldet(int id);
public List<Exam> alldet();
}
