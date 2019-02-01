package com.gregor.springboot.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gregor.springboot.app.models.entity.Cliente;

import java.util.List;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {
        
	@Query("select c from Cliente c inner join fetch c.concesionario f order by concesionario_id")
	public List<Cliente> findAllConcesionario();
        
	@Query("select c from Cliente c inner join fetch c.concesionario f order by ubicacion_id")
	public List<Cliente> findAllUbicacion();
}
