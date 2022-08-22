package com.BookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.Entity.Login;
import com.BookStore.Service.LoginService;


@RestController
@RequestMapping("/admin")
public class LoginController {
	@Autowired
	LoginService service;		
	@PostMapping("/")
	public String addUser(@RequestBody Login login)
	{
		service.addUser(login);
		return "Admin added successfully";
	}
	@GetMapping("/")
	public List<Login> showUser()
	{
		return service.showUser();
	}
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable("id") int id){
		
		service.deleteUser(id);
		return "Admin Deleted Successfully";
	}
	@PutMapping("/")
	public String updateUser(@RequestBody Login login)
	{
		service.addUser(login);
		return "Admin updated successfully";
	}
	

}