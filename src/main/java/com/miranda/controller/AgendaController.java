package com.miranda.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miranda.model.Contacto;
import com.miranda.service.IContactoService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
public class AgendaController {
	
	private final IContactoService service;
	
	@GetMapping("/contactos")
	public List<Contacto> recuperarContactos() {
		return service.findAll();
	}
	@GetMapping("/contactos/{id}")
	public Contacto recuperarContactos(@PathVariable() Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/contactos")
	public Contacto guardarContacto(@RequestBody Contacto contacto) {		
		return service.save(contacto);
	}
	
	@PutMapping("/contactos")
	public void actualizarContacto(@RequestBody Contacto contacto) {		
		service.update(contacto);
	}
		
	@DeleteMapping("/contactos/{id}")
	public void eliminarPorId(@PathVariable("id") Long idContacto) {
		service.findById(idContacto);
		
	}

}
