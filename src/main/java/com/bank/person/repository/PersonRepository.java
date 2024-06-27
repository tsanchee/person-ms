package com.bank.person.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.person.document.Person;
@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
	Person findByDocNumber(String docNumber);
}
