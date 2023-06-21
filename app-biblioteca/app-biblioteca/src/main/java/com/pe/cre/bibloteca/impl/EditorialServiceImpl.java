package com.pe.cre.bibloteca.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.pe.cre.bibloteca.model.Editorial;
import com.pe.cre.bibloteca.repository.IEditorialRepository;
import com.pe.cre.bibloteca.service.IEditorialService;

@Service
public class EditorialServiceImpl implements IEditorialService {
	
	private IEditorialRepository iEditorialRepository;
	
	

	public EditorialServiceImpl(IEditorialRepository iEditorialRepository) {
		super();
		this.iEditorialRepository = iEditorialRepository;
	}

	@Override
	public Editorial save(Editorial editorial) {
		// TODO Auto-generated method stub
		return this.iEditorialRepository.save(editorial);
	}


	@Override
	public Editorial findById(Long id) {  
		Editorial bean = this.iEditorialRepository.findById(id).get();
		return bean;
	}

	@Override
	public List<Editorial> finALL() {
		
		return this.iEditorialRepository.findAll();
	}

	@Override
	public Editorial update(Editorial editorial, Long id) {
	Editorial bean = this.iEditorialRepository.findById(id).get();
	bean.setName(editorial.getName());
	return this.iEditorialRepository.save(bean);
	}

}
