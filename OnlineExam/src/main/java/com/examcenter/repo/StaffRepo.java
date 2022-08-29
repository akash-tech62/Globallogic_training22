package com.examcenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examcenter.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Integer>{

}
