package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeDao;
import com.cg.dto.Trainee;

@Service("traineeservice")
@Transactional
public class TraineeServiceImpl implements ITraineeService
{

	@Autowired
	ITraineeDao traineeDao;
	
	@Override
	public void addTrainee(Trainee tr) 
	{
		traineeDao.addTrainee(tr);
	}

	@Override
	public List<Trainee> showTraineeById(int trId)
	{
		return traineeDao.showTraineeById(trId);
		
	}

	@Override
	public void deleteTrainee(int tId) 
	{
		traineeDao.deleteTrainee(tId);
		
	}

	@Override
	public List<Trainee> showAllDetails()
	{
		return traineeDao.showAllDetails();
	}

	@Override
	public void updateTrainee(Trainee tran)
	{
		traineeDao.updateTrainee(tran);
		
	}

}
