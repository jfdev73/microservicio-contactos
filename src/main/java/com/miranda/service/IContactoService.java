package com.miranda.service;

import java.util.List;

import com.miranda.model.Contacto;

public interface IContactoService {

	Contacto save(Contacto t);
	
	Contacto update(Contacto t);
	
	List<Contacto> findAll();
	
	Contacto findById(Long id);
	
	Contacto findByEmail(String email);
	
	void delete(Long id);
	
	void deleteByEmail(String  email);

}
