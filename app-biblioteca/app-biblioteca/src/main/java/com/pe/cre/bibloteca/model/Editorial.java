package com.pe.cre.bibloteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@ToString
@Entity
@Table(name = "t_editorial")
@Data
public class Editorial {
	
	@Id
	@Column(name = "ideditorial")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "estado") 
	private String estado;
	
	

}
