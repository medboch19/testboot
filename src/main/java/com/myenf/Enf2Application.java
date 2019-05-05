package com.myenf;
import com.myenf.dao.CandidatRepository;
import com.myenf.entities.Candidat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Enf2Application   {
	
	@Autowired
	private CandidatRepository candidatRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(Enf2Application.class, args);
		
	}
	/*@Override
	public void run(String... args) throws Exception {
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		candidatRepository.save(new Candidat(244, "ghlissi", "najib", "rue1", 21258050, "rue1", "rue1", "rue1", "4eme", "ingeneieur", 
				"pasdetaches", df.parse("12/10/2019"), "cat","najib@gmail.com" , 12, "info"));
		
      implements CommandLineRunner a ajouter devant    public class Enf2Applicatio  
	
	}*/
	

	
	
	
	
}
