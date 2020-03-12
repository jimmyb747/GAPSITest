package com.gapsi.example.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gapsi.example.api.bo.ItemDataBO;
import com.gapsi.example.api.respository.ItemRepository;
import com.gapsi.example.api.service.ItemService;

@Component
public class ItemServiceImpl implements ItemService{

	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public ItemDataBO findItemDataById(String itemId) {
		try {
			return itemRepository.findItemDataById(itemId);
		}catch(Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public boolean updateItemData(ItemDataBO itemDataBO) {
		try {
			itemRepository.save(itemDataBO);
			return Boolean.TRUE;
		}catch(Exception e) {
			System.err.println(e);
			return Boolean.FALSE;
		}
	}

}
