package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.EmpDao;
import com.model.Employee;


@Controller
public class EmpController {
	@Autowired    
    EmpDao dao;   
        
    @RequestMapping("/viewemp")    
    public String viewemp(Model m){    
        List<Employee> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "viewemp";    
    }    
   

}
