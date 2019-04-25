package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.exception.OwnerNotFoundException;
import com.example.demo.model.Owner;
import com.example.demo.service.CarMaintanceServiceMemImp;
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@Autowired
	private CarMaintanceServiceMemImp service;
	
	@RequestMapping(method = RequestMethod.GET,value = "/owners")
	public ResponseEntity<List<Owner>> getMessage() {

		return ResponseEntity.ok(service.findOwners());

	}
	@RequestMapping(method = RequestMethod.GET, value = "/owner/{id}")
	public ResponseEntity<?> getOwner(@PathVariable("id") int id) {
		try {
			Owner owner = service.findOwner(id);
			return ResponseEntity.ok(owner);
		} catch (OwnerNotFoundException ex) {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/owner")
	public ResponseEntity<List<Owner>> getOwners(@RequestParam("ln") String name) {
		List<Owner> owners = service.findByName(name);
		return ResponseEntity.ok(owners);
	}
}
