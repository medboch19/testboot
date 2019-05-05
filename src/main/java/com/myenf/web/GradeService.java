package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.GradeRepository;
import com.myenf.entities.Grade;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GradeService {

	@Autowired
	private GradeRepository gradeRepository ;
	@RequestMapping(value="/grades", method=RequestMethod.GET)
	public List<Grade> getGrades() {
		
		return gradeRepository.findAll();
	}
	
	@RequestMapping(value="/grades", method=RequestMethod.POST)
	public Grade save(@RequestBody Grade c) {
		
		return gradeRepository.save(c);
	}
	
	
	@RequestMapping(value="/grades/{id}", method=RequestMethod.GET)
	public Grade getCoondidats(@PathVariable Integer id) {
		
		return gradeRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/grades/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		gradeRepository.delete(id);
		
	}
	
	@RequestMapping(value="/grades/{id}", method=RequestMethod.PUT)
	public Grade save(@PathVariable Integer id, @RequestBody Grade c) {
		c.setIdGrade(id);
		return gradeRepository.save(c);
	}
	
}
