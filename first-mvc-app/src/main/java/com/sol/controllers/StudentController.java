package com.sol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.sol.models.Student;
import com.sol.security.UserInfoStatus;
import com.sol.service.StudentService;
import com.sol.validation.CustomValidator;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	CustomValidator customValidator;
	
	@Autowired
	UserInfoStatus userInfoStatus;
	

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public String showStudentPage(ModelMap model) {
		model.addAttribute("students", studentService.readAllStudents());
		
		if(userInfoStatus.isUserLoggedIn()) {
			model.addAttribute("name", userInfoStatus.getLoggedName());
		}
		

		return "students";
	}

	@RequestMapping(value = "/add-student", method = RequestMethod.GET)
	public String addStudentPage(ModelMap model) {
//		throw new RuntimeException("This is a test exception");
		return "addStudent";
	}

	@RequestMapping(value = "/add-student", method = RequestMethod.POST)
	public String addToStudent(ModelMap model, Student student) {
		
		if(!customValidator.checkNameLength(student.getName())) {
			model.addAttribute("errorMsg", "Name must be between 3 and 120 characters");
			return "add-student";
		}
		studentService.addStudent(student.getName(), student.getDate(), false);
		return "redirect:students";
	}

	@RequestMapping(value = "/delete-student", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam int id, ModelMap model) {
		studentService.deleteStudent(id);
		model.clear();
		return "redirect:students";
	}

	@RequestMapping(value = "/edit-student", method = RequestMethod.GET)
	public String editStudentPage(ModelMap model, @RequestParam int id) {
		model.addAttribute("student", studentService.getStudentInfo(id));
		return "update";
	}

	@RequestMapping(value = "/update-student", method = RequestMethod.POST)
	public String updateStudent(ModelMap model, Student student) {
		studentService.updateStudent(student.getId(), student.getName(), student.getDate(), student.getIsActive());
		return "redirect:students";
	}
	

}
