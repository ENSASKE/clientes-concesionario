package com.gregor.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gregor.springboot.app.models.dao.IClienteDao;
import com.gregor.springboot.app.models.dao.IConcesionarioDao;
import com.gregor.springboot.app.models.dao.IUbicacionDao;
import com.gregor.springboot.app.models.entity.Cliente;
import com.gregor.springboot.app.models.entity.Concesionario;
import com.gregor.springboot.app.models.entity.Ubicacion;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
		
	@Autowired
	private IConcesionarioDao concesionarioDao;
        
	@Autowired
	private IUbicacionDao ubicacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
        
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAllConcesionario() {
		return (List<Cliente>) clienteDao.findAllConcesionario();
	}
        
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAllUbicacion() {
		return (List<Cliente>) clienteDao.findAllUbicacion();
	}
        
	@Override
	@Transactional(readOnly = true)
	public List<Concesionario> findConcesionario() {
		return (List<Concesionario>) concesionarioDao.findAll();
	}
        
	@Override
	@Transactional(readOnly = true)
	public List<Ubicacion> findUbicacion() {
		return (List<Ubicacion>) ubicacionDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}	
	
}
