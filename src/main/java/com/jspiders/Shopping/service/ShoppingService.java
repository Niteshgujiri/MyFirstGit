package com.jspiders.Shopping.service;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jspiders.Shopping.entity.Cart;
import com.jspiders.Shopping.entity.CartDto;
import com.jspiders.Shopping.entity.Item;
import com.jspiders.Shopping.repository.CartRepository;
import com.jspiders.Shopping.repository.ItemRepository;

@Service
public class ShoppingService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	public  List<Item> addItemDetails( List<Item> item)
	{
		 return  itemRepository.saveAll(item);
	}
	
	public Optional<Item> getItemById(Long id)
	{
		return itemRepository.findById(id);
	}
	
	public Item saveItem(Item item)
	{
		return itemRepository.save(item);
	}
	
	public List<Cart> addToCart(List<Cart> cart)
	{
		return cartRepository.saveAll(cart);
	}

	
	public void processItemForCheckOut(List<CartDto> cart)
	{
		List<Cart> list=new ArrayList<Cart>();
		cart.forEach((each)->{
			Optional<Item> item=getItemById(each.getItemId());
			Item i=item.get();
			Cart t=new Cart();
			t.setItemId(each.getItemId());
			t.setQuantity(each.getQuantity());
			t.setUserId(each.getUserId());
			t.setPrice(i.getEachItemPrice()*each.getQuantity());
			list.add(t);
			i.setTotalAvailableItem(i.getTotalAvailableItem()-each.getQuantity());
			i.setSoldItems(i.getSoldItems()+each.getQuantity());
			
		});
		
		addToCart(list);
		
	}

}
