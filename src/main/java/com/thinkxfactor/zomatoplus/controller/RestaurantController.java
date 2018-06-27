package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.Users;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/create")
	public Restaurant createRestaurant(@RequestBody Restaurant rest)
	{
		Restaurant persistedRest=restaurantRepository.save(rest);
		return persistedRest;
		
	}
	
	@GetMapping("/getAll")
	public List<Restaurant> getAll()
	{
			List<Restaurant> listofrest=restaurantRepository.findAll();
			return listofrest;
		
	}

	
	@PostMapping("/add")
	public Item addItem(@RequestBody Item itm)
	{
		
		Item persistedItem=itemRepository.save(itm);

		return persistedItem;
	}
	
	@GetMapping("/getAllItem")
	public List<Item> getAllItem()
	{
			List<Item> listofitem=itemRepository.findAll();
			return listofitem;
		
	}
	
}
