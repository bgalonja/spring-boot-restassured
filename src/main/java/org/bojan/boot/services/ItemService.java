package org.bojan.boot.services;

import java.util.List;

import org.bojan.boot.model.Item;
import org.springframework.stereotype.Service;

public interface ItemService {

	List<Item> findAll();
	Item saveItem(Item item);
}
