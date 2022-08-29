
package com.examcenter.serviceImpl;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examcenter.repo.ResultRepo;
import com.examcenter.service.ResultService;
@Component
public class Resultserimpl implements ResultService{
@Autowired
ResultRepo resr;
	@Override
	public String adddet(Result rs) {
		resr.save(rs);
		return "Result addedd Successfully";
	}

	@Override
	public String updatedet(Result rs) {
		resr.save(rs);
		return "Result updated Successfully";
	}

	@Override
	public List<Result> alldet() {
		// TODO Auto-generated method stub
		return resr.findAll();
	}


}
