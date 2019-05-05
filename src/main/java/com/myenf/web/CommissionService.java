package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.CommissionRepository;
import com.myenf.entities.Commission;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CommissionService {
 
	@Autowired
	private CommissionRepository commissionRepository ;
	@RequestMapping(value="/commissions", method=RequestMethod.GET)
	public List<Commission> getCommission() {
		
		return commissionRepository.findAll();
	}
	
	@RequestMapping(value="/commissions", method=RequestMethod.POST)
	public Commission save(@RequestBody Commission c) {
		
		return commissionRepository.save(c);
	}
	
	
	@RequestMapping(value="/commissions/{id}", method=RequestMethod.GET)
	public Commission getCommissions(@PathVariable Integer id) {
		
		return commissionRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/commissions/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		commissionRepository.delete(id);
		
	}
	
	@RequestMapping(value="/commissions/{id}", method=RequestMethod.PUT)
	public Commission save(@PathVariable Integer id, @RequestBody Commission c) {
		c.setIdCommission(id);
		return commissionRepository.save(c);
	}
	
}
