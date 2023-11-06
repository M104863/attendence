package com.college.attendence.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.college.attendence.Model.Entity;
import com.college.attendence.Repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private Repository repo;

	public List<Entity> getdetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Entity addattend(Entity entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	public void deleteattend(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	
	
	

}
