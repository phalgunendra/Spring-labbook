package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.capg.dao.ProductRepo;
import com.capg.model.Products;
import com.capg.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	ProductRepo repo;
	@Autowired
	IProductService service;

	@RequestMapping("/")
	public ModelAndView home() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");

		return mv;
	}

	@RequestMapping("/add")
	public ModelAndView addProduct() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("addprod");

		return mv;

	}

	@RequestMapping("/success")
	public ModelAndView success(Products p) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("p", p);
		service.addProduct(p);
		mv.setViewName("success");

		return mv;

	}

	
	
	  @GetMapping(path = "/products")
	  
	  @ResponseBody
	  public List<Products> getAll() {
	  
	  return repo.findAll(); }
	 
	  
	 
}
