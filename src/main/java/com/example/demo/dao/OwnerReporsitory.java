package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Owner;

public interface OwnerReporsitory {
	Owner findById(int id);

	List<Owner> findByName(String id);

	List<Owner> findAll();

	Owner create(Owner o);

	void delete(int id);

	Owner update(Owner o);
}
