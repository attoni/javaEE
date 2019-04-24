package com.example.demo.dao.mem;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.CarReporsitory;
import com.example.demo.model.Car;
@Repository
public class CarReporisoryMemImp implements CarReporsitory {

	@Override
	public Car findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findByOwnerId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Car o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByOwnerId(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Car update(Car o) {
		// TODO Auto-generated method stub
		return null;
	}

}
