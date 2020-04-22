package com.capg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capg.model.Products;
@Repository
public class ProductdaoImpl implements IProductDao{
	@Autowired
	ProductRepo repo;

	@Override
	public Products addProduct(Products p) {

		Products e=repo.save(p);
		System.out.println(e);
		
		return e;
	}

}
