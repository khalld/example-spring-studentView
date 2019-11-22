package org.example.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.domain.Studente;
import org.example.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudenteController {
	
	@Autowired
	private StudenteService studService;
	
	private static final Log logger = LogFactory.getLog(StudenteController.class);
	
	
	@RequestMapping(value = "/list-students",method = RequestMethod.GET)
    public String listStudents(Model model) {
        logger.info("list-students");
        List<Studente> students = studService.getAllStudents();
        model.addAttribute("students", students);
        return "StudentsList";
    }
	
	@RequestMapping(value = "/input-student")
    public String inputBook(Model model) {
    	logger.info("input-student");
        model.addAttribute("stud", new Studente());
        return "StudentsAddForm";
    }
	
    @RequestMapping(value = "/add-student")
    public String addStudent(@ModelAttribute Studente stud) {
    	logger.info("add-student");
        List<Studente> students = studService.getAllStudents();
        students.add(stud);
        return "redirect:/list-students";
    }
    
    @RequestMapping(value = "/edit-student/{matricola}")
    public String editBook(Model model, @PathVariable String matricola) {
    	logger.info(" edit-student : "+ matricola); //Aggiungere id
        List<Studente> students = studService.getAllStudents();
        Studente stud = studService.searchByMatr(matricola);
        model.addAttribute("stud", stud);
        return "StudentEditForm";
    }
    
    @RequestMapping(value = "/update-student")
    public String updateBook(@ModelAttribute Studente stud) {
    	logger.info("update-student");
    	studService.update(stud);
        return "redirect:/list-students";
    }
    
}
