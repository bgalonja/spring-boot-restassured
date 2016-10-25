package org.bojan.boot.services;

import java.util.List;

import org.bojan.boot.model.Item;
import org.bojan.boot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemRepository itemRepository;

	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.saveAndFlush(item);
	}
	
	
}
