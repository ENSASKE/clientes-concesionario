package com.gregor.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gregor.springboot.app.models.entity.Ubicacion;

public interface IUbicacionDao extends CrudRepository<Ubicacion, Long>{

}
