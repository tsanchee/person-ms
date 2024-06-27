package com.bank.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.person.document.Person;
import com.bank.person.repository.PersonRepository;
import com.bank.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;

	
	public List<Person> getPeople() {
		return personRepository.findAll();
	}

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public Person editPerson(Person person) {
		return personRepository.save(person);
	}

	public boolean deletedPerson(String id) {
		boolean deleted = false;
		try {
			personRepository.deleteById(id);
			deleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleted;
	}

	public Person searchPerson(String docNumber) {
		return personRepository.findByDocNumber(docNumber);
	}

	
	public Person searchByPersonId(String id) {
		return personRepository.findById(id).get();
	}

}
