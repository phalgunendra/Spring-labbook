package com.capg.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capg.model.Trainee;
@Repository
public class ITraineeDaoImpl implements ITraineeDao {

	@Autowired
	TraineeRepo repo;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repo.save(trainee);
	}

	@Override
	public void deleteTrainee(Integer traineeId) {
		repo.deleteById(traineeId);
		

	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		Trainee train=repo.save(trainee);
		return train;
	}

	@Override
	public Trainee retrieveTrainee(Integer traineeId) {
		// TODO Auto-generated method stub
		return repo.findById(traineeId).orElse(null);
	}

	@Override
	public List<Trainee> retrieveAll() {
		// TODO Auto-generated method stub
		return (List<Trainee>) repo.findAll();
	}

}
