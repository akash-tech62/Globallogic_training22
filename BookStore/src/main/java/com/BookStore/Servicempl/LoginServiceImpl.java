package com.BookStore.Servicempl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.BookStore.Entity.Login;
import com.BookStore.Repo.LoginRepo;
import com.BookStore.Service.LoginService;

@Component
public class LoginServiceImpl implements LoginService {
@Autowired
LoginRepo loginRepo;
@Override
public void addUser(Login login) {
	loginRepo.save(login);	
}
public List<Login> showUser()
{
	return loginRepo.findAll();
}
public void deleteUser(int id) {
	loginRepo.deleteById(id);
}
public void updateUser(Login login) {
	loginRepo.save(login);	
}
}