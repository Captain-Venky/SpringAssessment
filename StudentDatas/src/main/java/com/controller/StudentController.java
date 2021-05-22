package com.controller;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
	
	@RequestMapping("/studform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Student());
    	return "studform"; 
    }  
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("stud") Student stud) throws SQLException{  
        dao.save(stud);  
        return "redirect:/viewstud";//will redirect to viewemp request mapping  
    }  
        
	
	 @RequestMapping("/viewstud") 
	 public String viewemp(Model m)
	 { 
		 List<Student>list=dao.getStudents(); 
		 m.addAttribute("list",list);
		 return "viewstud"; 
		 }
	 
   

}
