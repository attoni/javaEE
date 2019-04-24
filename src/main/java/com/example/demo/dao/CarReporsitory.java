package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Car;

public interface CarReporsitory {
	Car findById(int id);

	List<Car> findByOwnerId(int id);

	void create(Car o);

	void delete(int id);

	void deleteByOwnerId(int id);

	Car update(Car o);
}
