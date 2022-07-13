package com.dytechnology.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dytechnology.dsmeta.entities.sale;
import com.dytechnology.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<sale>findSales() {
		return repository.findAll();
		
	}

}
