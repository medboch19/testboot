package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.SurveillantRepository;
import com.myenf.entities.Surveillant;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SurveillantService {

	@Autowired
	private SurveillantRepository surveillantRepository ;
	@RequestMapping(value="/surveillants", method=RequestMethod.GET)
	public List<Surveillant> getSurveillants() {
		
		return surveillantRepository.findAll();
	}
	
	@RequestMapping(value="/surveillants", method=RequestMethod.POST)
	public Surveillant save(@RequestBody Surveillant c) {
		
		return surveillantRepository.save(c);
	}
	
	
	@RequestMapping(value="/surveillants/{id}", method=RequestMethod.GET)
	public Surveillant getCoondidats(@PathVariable Integer id) {
		
		return surveillantRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/surveillants/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		surveillantRepository.delete(id);
		
	}
	
	@RequestMapping(value="/surveillants/{id}", method=RequestMethod.PUT)
	public Surveillant save(@PathVariable Integer id, @RequestBody Surveillant c) {
		c.setIdSurveillant(id);
		return surveillantRepository.save(c);
	}
	
}
