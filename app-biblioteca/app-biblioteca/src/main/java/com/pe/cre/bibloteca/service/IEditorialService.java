package com.pe.cre.bibloteca.service;

import java.util.List;

import com.pe.cre.bibloteca.model.Editorial;

public interface IEditorialService {
	
	public Editorial save(Editorial editorial);
	
	public Editorial update(Editorial editorial , Long id);
	
	public Editorial findById(Long id );
	
	
	public List<Editorial> finALL();
	

}
