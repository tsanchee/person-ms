package com.bank.person.service;

import java.util.List;

import com.bank.person.document.Person;

public interface PersonService {
	List<Person> getPeople();
	Person savePerson(Person person);
	Person editPerson(Person person);
	boolean deletedPerson(String id);
	Person searchPerson(String docNumber);
	Person searchByPersonId(String id);
}
