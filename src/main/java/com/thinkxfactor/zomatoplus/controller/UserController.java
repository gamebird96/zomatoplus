package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Users;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	

	@GetMapping("/login")
	public Users userLogin(@RequestParam("Username") String username,
						@RequestParam("Password") String password)
	{
	
		Users log=userRepository.findByNameAndPassword(username, password);
		
		return log;
		
	}

	
	@PostMapping("/add")
	public Users addUser(@RequestBody Users user)
	{
		Users persistedUser=userRepository.save(user);
		return persistedUser;
		
	}
	
	@GetMapping("/getAll")
	public List<Users> getAll()
	{
			List<Users> listofusers=userRepository.findAll();
			return listofusers;
		
	}
	
	
	
	@PostMapping("/create")
	public Users userCreate(@RequestBody Users usr)
	{
		System.out.println(usr.toString());
		return usr;
	}
	
	

}
