package com.BookStore.Service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.BookStore.Entity.Login;


@Component
public interface LoginService {
	public void addUser(Login login);
	public List<Login> showUser();
	public void deleteUser(int id);
	public void updateUser(Login login);
}