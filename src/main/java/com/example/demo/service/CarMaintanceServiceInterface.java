package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.OwnerNotFoundException;
import com.example.demo.model.Owner;

public interface CarMaintanceServiceInterface {

	List<Owner> findOwners();
	List<Owner> findByName(String name);
	Owner findOwner(int id) throws OwnerNotFoundException;
	Owner createOwner(Owner o);
	void deleteOwner(int id);
}
