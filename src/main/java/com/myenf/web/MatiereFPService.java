package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.MatiereFPRepository;
import com.myenf.entities.MatiereFP;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MatiereFPService {

	@Autowired
	private MatiereFPRepository matiereFPRepository ;
	@RequestMapping(value="/matiereFPs", method=RequestMethod.GET)
	public List<MatiereFP> getMatiereFPs() {
		
		return matiereFPRepository.findAll();
	}
	
	@RequestMapping(value="/matiereFPs", method=RequestMethod.POST)
	public MatiereFP save(@RequestBody MatiereFP c) {
		
		return matiereFPRepository.save(c);
	}
	
	
	@RequestMapping(value="/matiereFPs/{id}", method=RequestMethod.GET)
	public MatiereFP getCoondidats(@PathVariable Integer id) {
		
		return matiereFPRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/matiereFPs/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		matiereFPRepository.delete(id);
		
	}
	
	@RequestMapping(value="/matiereFPs/{id}", method=RequestMethod.PUT)
	public MatiereFP save(@PathVariable Integer id, @RequestBody MatiereFP c) {
		c.setRefMatiereFP(id);
		return matiereFPRepository.save(c);
	}
	
}
