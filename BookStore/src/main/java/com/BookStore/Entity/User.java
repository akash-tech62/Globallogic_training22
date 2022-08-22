package com.BookStore.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String email;
	@Column
	String pass;
	@Column
	Long phno;
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
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", pass=" + pass + ", phno=" + phno + "]";
	}
	public User(int id, String email, String pass, Long phno) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.phno = phno;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}