package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.GroupeRepository;
import com.myenf.entities.Groupe;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GroupeService {

	@Autowired
	private GroupeRepository groupeRepository ;
	@RequestMapping(value="/groupes", method=RequestMethod.GET)
	public List<Groupe> getGroupes() {
		
		return groupeRepository.findAll();
	}
	
	@RequestMapping(value="/groupes", method=RequestMethod.POST)
	public Groupe save(@RequestBody Groupe c) {
		
		return groupeRepository.save(c);
	}
	
	
	@RequestMapping(value="/groupes/{id}", method=RequestMethod.GET)
	public Groupe getCoondidats(@PathVariable Integer id) {
		
		return groupeRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/groupes/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		groupeRepository.delete(id);
		
	}
	
	@RequestMapping(value="/groupes/{id}", method=RequestMethod.PUT)
	public Groupe save(@PathVariable Integer id, @RequestBody Groupe c) {
		c.setIdGroupe(id);
		return groupeRepository.save(c);
	}
	
	
}
