package com.examcenter.service;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Service;

@Service
public interface ResultService {
public String adddet(Result rs);
public String updatedet(Result rs);
public List<Result> alldet();
}