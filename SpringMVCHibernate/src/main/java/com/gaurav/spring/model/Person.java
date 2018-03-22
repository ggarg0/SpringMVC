package com.gaurav.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personId_generator")
	@SequenceGenerator(name = "personId_generator", sequenceName = "PERSON_SEQ", allocationSize = 1)
	@Column(name="id")
	private int id;
	/*
	 * CREATE SEQUENCE PERSON_SEQ START WITH 10001 INCREMENT BY 1 MINVALUE 10001
	 * NOCACHE NOCYCLE ORDER ;
	 */
	
	private String name;
	
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString(){
		return "id="+id+", name="+name+", country="+country;
	}
}
