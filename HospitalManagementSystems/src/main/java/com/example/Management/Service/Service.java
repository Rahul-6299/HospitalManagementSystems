package com.example.Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.Management.Entity.Entity;
import com.example.Management.Repository.Repository;

import jakarta.persistence.EntityNotFoundException;

@org.springframework.stereotype.Service

public class Service {
	@Autowired
	private Repository repo;
	public void save(Entity en)
	{
		repo.save(en);
	}
	public List<Entity>getAll()
	{
		return repo.findAll();
	}
	public void deleteall()
	{
		repo.deleteAll();
	}
	public Entity getById(Long id)
	{
		return repo.findById(id).orElse(null);
	}
	public void deleteByid(Long id)
	{
		 repo.deleteById(id);
	}
	public Entity UpdateyId(Long id,String Name)
	{
		Optional<Entity>op=repo.findById(id);
		if(op.isPresent())
		{
			Entity enn=op.get();
			enn.setName(Name);
			return repo.save(enn);
		}
		else
		{
			throw new EntityNotFoundException("Entity with ID " + id + " not found.");
		}
	}

}
