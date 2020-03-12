package com.gapsi.example.api;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gapsi.example.api.bo.ItemDataBO;
import com.gapsi.example.api.exception.InternalException;
import com.gapsi.example.api.exception.NotFoundException;
import com.gapsi.example.api.model.ApiResponse;
import com.gapsi.example.api.model.Item;
import com.gapsi.example.api.service.ItemService;

@RestController
@RequestMapping("/v1")
public class ItemApiService {

	@Autowired
	ItemService itemService;
	
	@GetMapping("/item/{itemId}")
	public Item getItemById(@Size(max=10) @PathVariable String itemId) throws NotFoundException {
		ItemDataBO itemBo = itemService.findItemDataById(itemId);
		if(itemBo == null) {
			throw new NotFoundException("No item found with id: "+itemId);
		}
		return convertBO(itemBo);
	}
	
	@PatchMapping("item/{itemId}")
	public ApiResponse updateItemWithForm(@Size(max=10)@PathVariable String itemId,
										@Size(max=200)@RequestParam(required = false) String description,
										@Size(max=200)@RequestParam(required = false) String model) throws NotFoundException, InternalException {
		ItemDataBO itemBo = itemService.findItemDataById(itemId);
		if(itemBo == null) {
			throw new NotFoundException("No item found with id: "+itemId);
		}
		if(description != null) {
			itemBo.setDescription(description);
		}
		if(model != null) {
			itemBo.setModel(model);
		}
		if(!itemService.updateItemData(itemBo)) {
			throw new InternalException("Unable to update item information");
		}
		return new ApiResponse(200, "Item updated successfully");
	}
	
	private Item convertBO(ItemDataBO itemBo) {
		Item item = new Item();
		item.setId(itemBo.getId());
		item.setName(itemBo.getName());
		item.setDescription(itemBo.getDescription());
		item.setModel(itemBo.getModel());
		item.setPrice(itemBo.getPrice());
		return item;
	}
}
