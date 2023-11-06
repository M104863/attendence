package com.college.attendence.Model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="attend")
public class Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentname;
	private String studentid;
	private String studentclass;
	private LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Entity(int id, String studentname, String studentid, String studentclass, LocalDate date) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentid = studentid;
		this.studentclass = studentclass;
		this.date = date;
	}
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", studentname=" + studentname + ", studentid=" + studentid + ", studentclass="
				+ studentclass + ", date=" + date + "]";
	}
	
	


	
	

	
	

}
