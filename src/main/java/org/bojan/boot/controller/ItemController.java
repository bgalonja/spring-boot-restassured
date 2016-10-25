package org.bojan.boot.controller;

import java.util.List;

import org.bojan.boot.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List findItems(){
		return itemService.findAll();
	}
	
}
