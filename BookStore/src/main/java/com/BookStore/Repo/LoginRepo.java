package com.BookStore.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.BookStore.Entity.Login;


public interface LoginRepo extends JpaRepository<Login, Integer> {
	

}