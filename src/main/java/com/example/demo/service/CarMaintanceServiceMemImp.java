package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OwnerReporsitory;
import com.example.demo.exception.OwnerNotFoundException;
import com.example.demo.model.Owner;

@Service
public class CarMaintanceServiceMemImp implements CarMaintanceServiceInterface {

	@Autowired
	private OwnerReporsitory ownerRepo;

	/*
	 * @Autowired private void SetRepo(OwnerReporsitory repo) { ownerRepo = repo;
	 * 
	 * }
	 */

	@Override
	public List<Owner> findOwners() {
		// TODO Auto-generated method stub
		return ownerRepo.findAll();
	}

	@Override
	public List<Owner> findByName(String name) {
		// TODO Auto-generated method stub
		return ownerRepo.findByName(name);
	}

	@Override
	public Owner findOwner(int id) throws OwnerNotFoundException {
		// TODO Auto-generated method stub
		if (ownerRepo.findById(id)==null) {
			throw new OwnerNotFoundException("Owner Bulunamadi");
		}
		return ownerRepo.findById(id);
	}

	@Override
	public Owner createOwner(Owner o) {
		// TODO Auto-generated method stub
		return ownerRepo.create(o);
	}

	@Override
	public void deleteOwner(int id) {
		ownerRepo.delete(id);

	}

}
