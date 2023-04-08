package com.mongoDb.connectionTrial.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongoDb.connectionTrial.models.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

	
	
	
}
