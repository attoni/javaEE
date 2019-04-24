package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Owner;
import com.example.demo.service.CarMaintanceServiceMemImp;

@Controller
public class TestController {
@Autowired
private CarMaintanceServiceMemImp service;

@RequestMapping("/test")
@ResponseBody
public List<Owner> getMessage() {
	
	return service.findOwners();
	
}
	
	
}
