package com.pe.cre.bibloteca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.cre.bibloteca.model.Editorial;
import com.pe.cre.bibloteca.service.IEditorialService;

@RestController
@RequestMapping("/editorial")
@CrossOrigin("*")
public class EditorialController {
	
	private IEditorialService iEditorialService;

	public EditorialController(IEditorialService iEditorialService) {
		super();
		this.iEditorialService = iEditorialService;
	}
	
	@GetMapping("/findAll")
	public List<Editorial>findAll(){
		return this.iEditorialService.finALL();
	}

}
