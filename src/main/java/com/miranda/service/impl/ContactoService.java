package com.miranda.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miranda.model.Contacto;
import com.miranda.repository.IAgendaRepository;
import com.miranda.service.IContactoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContactoService implements IContactoService{
	
	private final IAgendaRepository repo;

	@Override
	public Contacto save(Contacto contacto) {
		return repo.save(contacto);
	}
	
	@Override
	public Contacto findByEmail(String email) {
		return repo.findByEmail(email).orElse(null);
	}

	@Override
	public Contacto update(Contacto contacto) {
		Contacto c = findById(contacto.getIdContacto());
		if(c.getIdContacto()!=null) {
			return repo.save(contacto);
		}else {
			return null;
		}
			
		
		
	}

	@Override
	public List<Contacto> findAll() {
		return repo.findAll();
	}

	@Override
	public Contacto findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		
		repo.deleteById(id);
	}

	@Override
	public void deleteByEmail(String email) {
		
		Contacto c = findByEmail(email);
		if(c!=null)
		 repo.deleteByEmail(email);
		
	}

	

}
