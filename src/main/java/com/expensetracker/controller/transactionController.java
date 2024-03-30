package com.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expensetracker.entity.transaction;
import com.expensetracker.repository.transactionRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class transactionController {

	@Autowired
	transactionRepository transrep;
	
	
	@PostMapping("/addtrans")
	transaction posttrans(@RequestBody transaction tran) {
		return transrep.save(tran);
	}
	
	
	@GetMapping("/gettrans")
	List<transaction> gettrans(){
		return transrep.findAll();		
	}
	
	
	@DeleteMapping("/deletetrans/{id}")
	String deletetrans(@PathVariable Integer id ) {
		if(!transrep.existsById(id)) {
			return "not found";
		}
		
		transrep.deleteById(id);
		return "deleted successfully";
	}
	
}
