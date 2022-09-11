package com.jspiders.Shopping.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="item_info")
public class Item implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="total_quantity")
	private Long totalQuantity;
	
	@Column(name="total_available_item")
	private Long totalAvailableItem;
	
	@Column(name="each_item_price")
	private Long eachItemPrice;
	
	@Column(name="sold_items")
	private Long soldItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Long getTotalAvailableItem() {
		return totalAvailableItem;
	}

	public void setTotalAvailableItem(Long totalAvailableItem) {
		this.totalAvailableItem = totalAvailableItem;
	}

	public Long getEachItemPrice() {
		return eachItemPrice;
	}

	public void setEachItemPrice(Long eachItemPrice) {
		this.eachItemPrice = eachItemPrice;
	}


	public Long getSoldItems() {
		return soldItems;
	}

	public void setSoldItems(Long soldItems) {
		this.soldItems = soldItems;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", totalQuantity=" + totalQuantity + ", totalAvailableItem="
				+ totalAvailableItem + ", eachItemPrice=" + eachItemPrice + ", soldItems=" + soldItems + "]";
	}

	
	
	
	

}
