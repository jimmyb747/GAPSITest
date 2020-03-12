package com.gapsi.example.api.service;

import com.gapsi.example.api.bo.ItemDataBO;

public interface ItemService {
	
	ItemDataBO findItemDataById(String itemId);
	boolean updateItemData(ItemDataBO itemDataBO);

}
