package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Trainee {
	@Id
	private int traineeId;
	@NonNull 
	private String traineeName;
	
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeLocation="
				+ traineeLocation + ", traineeDomain=" + traineeDomain + "]";
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	private String traineeLocation;
	private String traineeDomain;

}
