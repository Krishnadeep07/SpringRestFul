package com.krishna.demo.Model;

import javax.xml.bind.annotation.XmlRootElement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@XmlRootElement
@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private int points;
	public int getStudentID() {
		return id;
	}
	public void setStudentID(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return name;
	}
	public void setStudentName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", points=" + points + "]";
	}
	
	

}
