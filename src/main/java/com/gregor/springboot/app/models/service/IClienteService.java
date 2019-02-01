package com.gregor.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gregor.springboot.app.models.entity.Cliente;
import com.gregor.springboot.app.models.entity.Concesionario;
import com.gregor.springboot.app.models.entity.Ubicacion;

public interface IClienteService {

	public List<Cliente> findAll();
        
	public List<Cliente> findAllConcesionario();
        
	public List<Cliente> findAllUbicacion();
        
	public List<Concesionario> findConcesionario();
        
	public List<Ubicacion> findUbicacion();
	
	public Page<Cliente> findAll(Pageable pageable);

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
		
	public void delete(Long id);
}
