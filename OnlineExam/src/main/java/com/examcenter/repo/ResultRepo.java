package com.examcenter.repo;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepo extends JpaRepository<Result,Integer>
{

}
