package com.gapsi.example.api.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_DATA")
public class ItemDataBO {

	@Id
	@Column(name = "ITEM_ID")
	private String id;
	@Column(name = "ITEM_NAME")
	private String name;
	@Column(name = "ITEM_DESC")
	private String description;
	@Column(name = "ITEM_MODEL")
	private String model;
	@Column(name = "ITEM_PRICE")
	private float price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	} 
}
