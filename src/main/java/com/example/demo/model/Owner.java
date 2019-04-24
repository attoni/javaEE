package com.example.demo.model;

import java.util.List;
import java.util.Set;

public class Owner {

	private int id;
	private String name;
	private String year;
	Set<Car> carList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Set<Car> getCarList() {
		return carList;
	}
	public void setCarList(Set<Car> carList) {
		this.carList = carList;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", year=" + year + ", carList=" + carList + "]";
	}
	
}
