package com.jspiders.Shopping.entity;

public class CartDto {

	private Long itemId;
	private Long quantity;
	private Long userId;
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "CartDto [itemId=" + itemId + ", quantity=" + quantity + ", userId=" + userId + "]";
	}
	
	
}
