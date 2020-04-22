package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IProductDao;
import com.capg.model.Products;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductDao dao;

	@Override
	public Products addProduct(Products p) {
	
		return dao.addProduct(p);
	}

}
