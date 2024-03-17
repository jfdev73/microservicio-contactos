package com.miranda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.miranda.model.Contacto;

import jakarta.transaction.Transactional;

public interface IAgendaRepository extends JpaRepository<Contacto, Long> {
	
	 Optional<Contacto>findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query
	void deleteByEmail(String email);
	
	

}
