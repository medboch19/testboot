package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.CandidatRepository;
import com.myenf.dao.DossierRepository;
import com.myenf.entities.Candidat;
import com.myenf.entities.Dossier;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DossierService {
	
	@Autowired
	private DossierRepository dossierRepository ;
	@RequestMapping(value="/dossiers", method=RequestMethod.GET)
	public List<Dossier> getDossier() {
		
		return dossierRepository.findAll();
	}
	
	@RequestMapping(value="/dossiers", method=RequestMethod.POST)
	public Dossier save(@RequestBody Dossier d) {
		
		return dossierRepository.save(d);
	}
	
	
	@RequestMapping(value="/dossier/{id}", method=RequestMethod.GET)
	public Dossier getDossier(@PathVariable Integer id) {
		
		return dossierRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/dossiers/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		dossierRepository.delete(id);
		
	}
	
	@RequestMapping(value="/dossiers/{id}", method=RequestMethod.PUT)
	public Dossier save(@PathVariable Integer id, @RequestBody Dossier d) {
		d.setIdDossier(id);
		return dossierRepository.save(d);
	}
	
	
}
