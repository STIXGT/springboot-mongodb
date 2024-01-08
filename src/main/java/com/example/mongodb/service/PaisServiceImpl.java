package com.example.mongodb.service;

import com.example.mongodb.domain.Pais;
import com.example.mongodb.repository.PaisPersistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PaisServiceImpl implements PaisService {
	@Autowired
	private PaisPersistence employeeRepo;

	@Override
	public Pais save(Pais pais) {
		return employeeRepo.save(pais);
	}

	@Override
	public List<Pais> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public List<Pais> searchPais(String name) {
		return employeeRepo.findByName(name);
	}

}
