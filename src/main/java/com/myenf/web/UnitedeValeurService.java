package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.UnitedeValeurRepository;
import com.myenf.entities.UnitedeValeur;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UnitedeValeurService {

	@Autowired
	private UnitedeValeurRepository unitedevaleurRepository ;
	@RequestMapping(value="/unitedevaleurs", method=RequestMethod.GET)
	public List<UnitedeValeur> getUnitedeValeurs() {
		
		return unitedevaleurRepository.findAll();
	}
	
	@RequestMapping(value="/unitedevaleurs", method=RequestMethod.POST)
	public UnitedeValeur save(@RequestBody UnitedeValeur c) {
		
		return unitedevaleurRepository.save(c);
	}
	
	
	@RequestMapping(value="/unitedevaleurs/{id}", method=RequestMethod.GET)
	public UnitedeValeur getCoondidats(@PathVariable Integer id) {
		
		return unitedevaleurRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/unitedevaleurs/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		unitedevaleurRepository.delete(id);
		
	}
	
	@RequestMapping(value="/unitedevaleurs/{id}", method=RequestMethod.PUT)
	public UnitedeValeur save(@PathVariable Integer id, @RequestBody UnitedeValeur c) {
		c.setReferenceUn(id);
		return unitedevaleurRepository.save(c);
	}
	
}
