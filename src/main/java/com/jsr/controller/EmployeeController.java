package com.jsr.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsr.dao.IDemoAppDao;
import com.jsr.model.EmployeeForm;

@Controller
public class EmployeeController {

	@Autowired
	IDemoAppDao demoDao;
	
	@RequestMapping(value = "/home",  method = RequestMethod.GET)
    public String redirectToHomePage(ModelMap model) {
		
		  //demoDao.saveEmployee();
	      //model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "home";
	}
	
	@RequestMapping(value = "/registerForm",  method = RequestMethod.GET)
    public String redirectToRegistrationPage(ModelMap model) {
		
		EmployeeForm empForm = new EmployeeForm();    
        model.put("empForm", empForm);
         
        List<String> professionList = new ArrayList<>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
	      return "registerForm";
	}
	
	@RequestMapping(value = "/register",  method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("empForm") EmployeeForm empForm,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         
        // for testing purpose:
        System.out.println("username: " + empForm.getUsername());
        System.out.println("password: " + empForm.getPassword());
        System.out.println("email: " + empForm.getEmail());
        System.out.println("birth date: " + empForm.getBirthDate());
        System.out.println("profession: " + empForm.getProfession());
         
        List<String> professionList = new ArrayList<>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
	      return "registerForm";
    }
	
	@RequestMapping(value = "/searchPage",  method = RequestMethod.GET)
    public String redirectToSearchPage(ModelMap model) {
		
		  //demoDao.saveEmployee();
	      //model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "searchPage";
	}
}
