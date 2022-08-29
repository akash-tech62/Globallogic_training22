package com.examcenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examcenter.entity.Exam;

public interface ExamRepo extends JpaRepository<Exam,Integer>{

}
