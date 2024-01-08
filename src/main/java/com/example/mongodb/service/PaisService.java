package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Pais;

public interface PaisService {

	public Pais save(Pais pais);

	List<Pais> getAllEmployee();

	List<Pais> searchPais(String name);

}
