package com.bank.person.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.person.document.Person;
import com.bank.person.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@GetMapping(value="/api/v1/people")
	@ResponseBody List<Person> getPeople(){
		return personService.getPeople();
	}

	@PostMapping(value="/api/v1/people")
	@ResponseBody Person savePerson(@RequestBody Person person){
		return personService.savePerson(person);
	}
	
	@PutMapping(value="/api/v1/people")
	@ResponseBody Person editPerson(@RequestBody Person person){
		return personService.editPerson(person);
	}
	
	@DeleteMapping(value="/api/v1/people/{id}")
	@ResponseBody boolean deletedPerson(@PathVariable String id){
		return personService.deletedPerson(id);
	}
	
	@GetMapping(value="/api/v1/people/docs/{docNumber}")
	@ResponseBody Person searchPerson(@PathVariable String docNumber){
		return personService.searchPerson(docNumber);
	}
	
	@GetMapping(value="/api/v1/people/ids/{id}")
	@ResponseBody Person searchByPersonId(@PathVariable String id){
		return personService.searchByPersonId(id);
	}
}
