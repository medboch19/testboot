package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.myenf.dao.DisciplineRepository;
import com.myenf.entities.Discipline;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DisciplineService {

	@Autowired
	private DisciplineRepository disciplineRepository ;
	@RequestMapping(value="/disciplines", method=RequestMethod.GET)
	public List<Discipline> getDisciplines() {
		
		return disciplineRepository.findAll();
	}
	
	@RequestMapping(value="/disciplines", method=RequestMethod.POST)
	public Discipline save(@RequestBody Discipline c) {
		
		return disciplineRepository.save(c);
	}
	
	
	@RequestMapping(value="/disciplines/{id}", method=RequestMethod.GET)
	public Discipline getDiscipline(@PathVariable Integer id) {
		
		return disciplineRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/disciplines/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		disciplineRepository.delete(id);
		
	}
	
	@RequestMapping(value="/disciplines/{id}", method=RequestMethod.PUT)
	public Discipline save(@PathVariable Integer id, @RequestBody Discipline c) {
		c.setReference(id);
		return disciplineRepository.save(c);
	}
	
	
}
