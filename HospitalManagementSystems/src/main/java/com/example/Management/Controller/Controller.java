package com.example.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Management.Appconstants.Appconstants;
import com.example.Management.Entity.Entity;
import com.example.Management.Service.Service;

@org.springframework.stereotype.Controller
@RestController
@RequestMapping(value=Appconstants.Hospital_Controller)

public class Controller {
	@Autowired
	public Service ser;
	
	@PostMapping(value=Appconstants.Hospital_Save)
	public void saveAll(@RequestBody Entity en)
	{
		ser.save(en);
	}
	@GetMapping(value=Appconstants.Hospital_GetAll)
	public @ResponseBody List<Entity>getall()
	{
		return ser.getAll();
	}
	@GetMapping(value=Appconstants.Hospital_GetById)
	public Entity getbyid(@PathVariable Long id)
	{
		return ser.getById(id);
	}
	@DeleteMapping(value=Appconstants.Hospital_DeleteAll)
	public void deleteall()
	{
		ser.deleteall();
	}
	@DeleteMapping(value=Appconstants.Hospital_DeleteById)
	public void deleteById(@RequestBody Long id)
	{
		ser.deleteByid(id);
	}
	
	@PatchMapping(value=Appconstants.Hospital_UpdateById)
	public ResponseEntity<Entity> UpdateById(@PathVariable Long id,@RequestBody String name)
	{
		Entity e=ser.UpdateyId(id, name);
		return ResponseEntity.ok(e);
	}

}
