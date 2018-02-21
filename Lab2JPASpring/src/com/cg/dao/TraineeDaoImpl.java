package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;



import com.cg.dto.Trainee;


@Repository("traineeDao")
public class TraineeDaoImpl implements ITraineeDao
{
	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public void addTrainee(Trainee tr)
	{
		entitymanager.persist(tr);
		entitymanager.flush();
			
	}
	@Override
	public List<Trainee> showTraineeById(int trId) 
	{
		Query queryOne=entitymanager.createQuery("Select t FROM Trainee t WHERE traineeId=:tId");
		queryOne.setParameter("tId", trId);
		
		 List<Trainee> myList=queryOne.getResultList();
		 return myList;
	}
	@Override
	public void deleteTrainee(int tId) 
	{
		Query queryTwo=entitymanager.createQuery("Delete FROM Trainee WHERE traineeId=:tId");
		queryTwo.setParameter("tId", tId);
		queryTwo.executeUpdate();
		
	}
	@Override
	public List<Trainee> showAllDetails()
	{
		Query queryThree=entitymanager.createQuery("FROM Trainee");
		List<Trainee> myList=queryThree.getResultList();
		return myList;
	}
	@Override
	public void updateTrainee(Trainee tran)
	{
		Query queryFour=entitymanager.createQuery
				("Update Trainee set traineeName=:tName,"
						+ "traineeLocation=:tLocation,"
						+ "traineeDomain=:tDomain WHERE traineeId=:tId");
		queryFour.setParameter("tId", tran.getTraineeId());
		queryFour.setParameter("tName", tran.getTraineeName());
		queryFour.setParameter("tLocation", tran.getTraineeLocation());
		queryFour.setParameter("tDomain", tran.getTraineeDomain());
		queryFour.executeUpdate();
		
	}

}
