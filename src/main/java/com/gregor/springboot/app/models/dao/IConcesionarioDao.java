package com.gregor.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gregor.springboot.app.models.entity.Concesionario;

public interface IConcesionarioDao extends CrudRepository<Concesionario, Long>{

}
