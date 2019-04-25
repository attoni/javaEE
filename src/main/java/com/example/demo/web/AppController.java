package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Owner;
import com.example.demo.service.CarMaintanceServiceMemImp;

@Controller
public class AppController {
	@Autowired
	private CarMaintanceServiceMemImp service;

	@RequestMapping("/Owners")
	@ResponseBody
	public ModelAndView getOwners() {
		ModelAndView m = new ModelAndView();
		m.addObject("owners", service.findOwners());
		m.setViewName("owners");
		return m;
	}

	

}
