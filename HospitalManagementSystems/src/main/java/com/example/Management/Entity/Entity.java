package com.example.Management.Entity;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import com.example.Management.Appconstants.Appconstants;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@jakarta.persistence.Entity
@Table(name=Appconstants.Hospital_info)

public class Entity implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	
	

}
