package com.BookStore.Controller;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.Service.UserService;

import antlr.collections.List;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;		
	@PostMapping("/")
	public String addUser(@RequestBody User user)
	{
		service.addUser(user);
		return "User Added successfully";
	}
	@GetMapping("/")
	public List<User> showUser()
	{
		return service.showUser();
	}
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable("id") int id){
		
		service.deleteUser(id);
		return "User Deleted Successfully";
	}
	

}