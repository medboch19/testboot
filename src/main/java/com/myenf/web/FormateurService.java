package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.FormateurRepository;
import com.myenf.entities.Formateur;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormateurService {
	@Autowired
	private FormateurRepository formateurRepository ;
	@RequestMapping(value="/formateurs", method=RequestMethod.GET)
	public List<Formateur> getFormateurs() {
		
		return formateurRepository.findAll();
	}
	
	@RequestMapping(value="/formateurs", method=RequestMethod.POST)
	public Formateur save(@RequestBody Formateur c) {
		
		return formateurRepository.save(c);
	}
	
	
	@RequestMapping(value="/formateurs/{id}", method=RequestMethod.GET)
	public Formateur getCoondidats(@PathVariable Integer id) {
		
		return formateurRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/formateurs/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		formateurRepository.delete(id);
		
	}
	
	@RequestMapping(value="/formateurs/{id}", method=RequestMethod.PUT)
	public Formateur save(@PathVariable Integer id, @RequestBody Formateur c) {
		c.setIdFormateur(id);
		return formateurRepository.save(c);
	}
	
}
