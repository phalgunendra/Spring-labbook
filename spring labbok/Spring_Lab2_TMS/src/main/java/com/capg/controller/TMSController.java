package com.capg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.model.Trainee;
import com.capg.service.ITraineeService;

@Controller
public class TMSController {
	@Autowired
	Trainee train;
	@Autowired
	ITraineeService service;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");

		return mv;
	}

	@RequestMapping("/addTrainee")
	public ModelAndView add() {

		ModelAndView mv = new ModelAndView("addTrainee");

		return mv;
	}

	@RequestMapping("/success")
	public ModelAndView success(Trainee trainee) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("trainee", trainee);

		mv.setViewName("home");

		service.addTrainee(trainee);

		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView delete() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("delete");

		return mv;
	}

	@RequestMapping("/delete_confirm")
	public ModelAndView delete(@RequestParam Integer traineeId) {

		ModelAndView mv = new ModelAndView();

		Trainee trainee = service.retrieveTrainee(traineeId);

		mv.addObject("trainee", trainee);

		mv.setViewName("delete");


		return mv;
	}

	@RequestMapping("/delete_confirmed")
	public ModelAndView deleteConfirmed( Integer traineeId) {

		ModelAndView mv = new ModelAndView();

		service.deleteTrainee(traineeId);
		mv.setViewName("home");

		return mv;
	}

	@RequestMapping("/retrieve")
	public ModelAndView retrieve() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("retrieve");

		return mv;
	}

	@RequestMapping("/retrieve_view")
	public ModelAndView retrieve(@RequestParam Integer traineeId) {

		ModelAndView mv = new ModelAndView();

		Trainee trainee = service.retrieveTrainee(traineeId);

		mv.addObject("trainee", trainee);

		mv.setViewName("retrieve_view");

		return mv;
	}

	@RequestMapping("/retrieve_all")
	public ModelAndView retrieveAll() {

		ModelAndView mv = new ModelAndView();

		List<Trainee> trainee = service.retrieveAll();
		mv.addObject("trainee", trainee);
		mv.setViewName("retrieve_all");

		return mv;
	}
	@RequestMapping("/modify")
	public ModelAndView modify() {

	ModelAndView mv = new ModelAndView();

	mv.setViewName("modify");

	return mv;
	}

	@RequestMapping("/modify_confirm")
	public ModelAndView modify(@RequestParam Integer traineeId) {

	ModelAndView mv = new ModelAndView();

	Trainee trainee = service.retrieveTrainee(traineeId);

	mv.addObject("trainee", trainee);

	mv.setViewName("modify");

	return mv;
	}

	@RequestMapping("/modify_confirmed")
	public ModelAndView modifyConfirmed(Trainee trainee) {

	ModelAndView mv = new ModelAndView();

	service.modifyTrainee(trainee);
	mv.setViewName("home");

	return mv;
	}

}
