package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.dao.StudentDao;
import com.model.Student;


@Controller
public class StudentController {
	@Autowired    
    StudentDao dao;   
	
	@RequestMapping("/studform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Student());
    	return "studform"; 
    }  
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("stud") Student stud){  
        dao.save(stud);  
        return "redirect:/viewstud";//will redirect to viewemp request mapping  
    }  
        
    @RequestMapping("/viewstud")    
    public String viewemp(Model m){    
        List<Student> list=dao.getStudents();    
        m.addAttribute("list",list);  
        return "viewstud";    
    }    
   

}
