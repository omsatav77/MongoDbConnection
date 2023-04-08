package com.mongoDb.connectionTrial.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "students")
public class Student {

	int id;
	String name;
	String city;
	String clg;

	
	
}
