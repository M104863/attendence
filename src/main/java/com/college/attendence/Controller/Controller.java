package com.college.attendence.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.attendence.Model.Entity;
import com.college.attendence.Service.Service;

@RestController
@CrossOrigin(origins="*",allowCredentials = "false",allowedHeaders = "*")
public class Controller {
	
	@Autowired
	private Service service;
	
	@GetMapping("/")
	public List<Entity> getdetails(){
		return service.getdetails();
	}
	
	@PostMapping("/attend")
	public Entity addattend(@RequestBody Entity entity) {
		return service.addattend(entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteattend(@PathVariable int id) {
		 service.deleteattend(id);
	}

}
