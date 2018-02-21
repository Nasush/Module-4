package com.cg.service;

import java.util.List;

import com.cg.dto.Trainee;


public interface ITraineeService
{
	public void addTrainee(Trainee tr);
	public List<Trainee>showTraineeById(int trId);
	public void deleteTrainee(int tId);
	public List<Trainee> showAllDetails();
	public void updateTrainee(Trainee tran);
}
