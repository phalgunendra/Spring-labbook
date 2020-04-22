package com.capg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.ITraineeDao;
import com.capg.model.Trainee;
@Service
public class ITraineeServiceImpl implements ITraineeService {
@Autowired
ITraineeDao dao;
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.addTrainee(trainee);
	}

	@Override
	public void deleteTrainee(Integer traineeId) {
		dao.deleteTrainee(traineeId);

	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return dao.modifyTrainee(trainee);
	}

	@Override
	public Trainee retrieveTrainee(Integer traineeId) {
		// TODO Auto-generated method stub
		return dao.retrieveTrainee(traineeId);
	}

	@Override
	public List<Trainee> retrieveAll() {
		// TODO Auto-generated method stub
		return dao.retrieveAll();
	}

}
