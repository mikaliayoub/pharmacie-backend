package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.Photo;
import com.example.demo2.repository.PhotoRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("photos")
public class PhotoController {
	@Autowired
	private PhotoRepository photoRepository;
	@PostMapping("/save")
	public void save(@RequestBody Photo photo){
	photoRepository.save(photo);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
	Photo s = photoRepository.findById(Integer.parseInt(id));
	photoRepository.delete(s);
	}
	@GetMapping("/all")
	public List<Photo> findAll(){
	return photoRepository.findAll();
	}
	@GetMapping(value = "/count")
	public long countPhoto() {
	return photoRepository.count();
	}

}
