package com.BookStore.Servicempl;


import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.BookStore.Repo.UserRepo;
import com.BookStore.Service.UserService;

@Component
public class UserServiceImpl implements UserService {
@Autowired
UserRepo userRepo;
@Override
public void addUser(User user) {
	userRepo.save(user);	
}
public List<User> showUser()
{
	return userRepo.findAll();
}
public void deleteUser(int id) {
	userRepo.deleteById(id);
}

}