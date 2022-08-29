package com.examcenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examcenter.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
