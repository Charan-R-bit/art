package com.art.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.entity.art;
import com.art.repo.Repo;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/art")
public class artController 
{
	@Autowired
	Repo rep;
	@GetMapping("/get")
	public  List<art> getController()
	{
		return rep.findAll();
	}
	@GetMapping("/get/{id}")
	public Optional<art> getbyId(@PathVariable int id)
	{
		return rep.findById(id);
		
	}
	@PostMapping("/post")
	public void post(@RequestBody @Valid art a)
	{
		rep.save(a);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		rep.deleteById(id);
	}
}
