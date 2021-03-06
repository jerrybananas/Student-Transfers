package gr.hua.dit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.entity.Student;
import gr.hua.dit.entity.University;
import gr.hua.dit.service.StudentService;
import gr.hua.dit.service.UniversityService;

@Controller
@RequestMapping("/student")
public class StudentController{

	// inject the customer service
	@Autowired
	private StudentService studentService;

	@Autowired
	private UniversityService universityService;
	

	
	public static Student student;

	//////////////////////////////////////////////////
	// Student Home screen
	/////////////////////////////////////////////////
	@GetMapping("/home")
	public String homePage(Model model) {
		List<Student> students = studentService.getStudents();
		for (Student eachStudent : students) {
			if (LoginController.loginid==eachStudent.getStudent_id()) {
				student = eachStudent;
			}
		}
		model.addAttribute("student", student);
		model.addAttribute("pageTitle", "Student Home Page");
		//studentservice.deleteStudent(student.getStudent_id());
		return "student-home-page";
	}

	//////////////////////////////////////////////////
	// Student Application Form
	/////////////////////////////////////////////////
	@GetMapping("/application")
	public String application(Model model) {
		//Find universities that the student is eligible to apply
		List<University> universities = universityService.getUniversities();
		int studentUniId = -1;
		for (University eachUni : universities) {
			if (eachUni.getUni_name().equals(student.getStudent_uni())) {
				studentUniId = eachUni.getEligible_uni_id();
			}
		}
		List<University> eligibleUniversities = new ArrayList<University>();
		for (University eachUni : universities) {
			if (eachUni.getEligible_uni_id() == studentUniId && !(eachUni.getUni_name().equals(student.getStudent_uni()))) {
				eligibleUniversities.add(eachUni);
			}
		}
		model.addAttribute("student", student);
		model.addAttribute("universities", eligibleUniversities);
		model.addAttribute("pageTitle", "Student Form");
		return "student-application";
	}
	
	@RequestMapping(value="/updateForm", method= RequestMethod.POST, produces = { "application/json", "application/xml" })
	public String updateForm(@RequestParam("uni1") String first_choice, @RequestParam("uni2") String second_choice, @RequestParam("sameCitySiblings") int same_city_siblings, @RequestParam("underagedSiblings") int underaged_siblings,
			 @RequestParam("familyIncome") int family_income, @RequestParam("sameCity") boolean same_city) {

		System.out.println(student.toString());
		student.setFirst_choice(first_choice);
		student.setSecond_choice(second_choice);
		student.setSame_city_siblings(same_city_siblings);
		student.setUnderaged_siblings(underaged_siblings);
		student.setFamily_income(family_income);
		student.setSame_city(same_city);
		int x = (same_city_siblings*100) + (underaged_siblings*50);
		if(family_income<=8000) {
			x+=80;
		}else if(family_income>8000 && family_income<=12000) {
			x+=40;
		}
		if(same_city==true) {
			x+=50;
		}
		student.setStudent_points(x);
		
		System.out.println(student.toString());

		studentService.updateStudent(student);
		return "redirect:/student/application";
	}

}
