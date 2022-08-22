package com.BookStore.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String email;
	@Column
	String pass;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", pass=" + pass + "]";
	}
	public Login(int id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}