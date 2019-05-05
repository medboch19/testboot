package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.SessionRepository;
import com.myenf.entities.Session;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SessionService {

	@Autowired
	private SessionRepository sessionRepository ;
	@RequestMapping(value="/sessions", method=RequestMethod.GET)
	public List<Session> getSessions() {
		
		return sessionRepository.findAll();
	}
	
	@RequestMapping(value="/sessions", method=RequestMethod.POST)
	public Session save(@RequestBody Session c) {
		
		return sessionRepository.save(c);
	}
	
	
	@RequestMapping(value="/sessions/{id}", method=RequestMethod.GET)
	public Session getCoondidats(@PathVariable Integer id) {
		
		return sessionRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/sessions/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		sessionRepository.delete(id);
		
	}
	
	@RequestMapping(value="/sessions/{id}", method=RequestMethod.PUT)
	public Session save(@PathVariable Integer id, @RequestBody Session c) {
		c.setIdAnnonceSession(id);
		return sessionRepository.save(c);
	}
	
}
