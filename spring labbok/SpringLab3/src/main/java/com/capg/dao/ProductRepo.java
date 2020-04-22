package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.model.Products;

public interface ProductRepo extends JpaRepository<Products, Integer> {

}
