package com.jspiders.Shopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.Shopping.constant.ShoppingConstant;
import com.jspiders.Shopping.entity.Cart;
import com.jspiders.Shopping.entity.CartDto;
import com.jspiders.Shopping.entity.Item;
import com.jspiders.Shopping.service.ShoppingService;

@RestController
@RequestMapping(value =ShoppingConstant.FOREWARD_SLASH)
public class ShoppingController {
	
	@Autowired
	private ShoppingService shoppingService;
	
	
	@PostMapping(value=ShoppingConstant.ADD_ITEM_DETAILS)
	public @ResponseBody List<Item> addItemDetails(@RequestBody List<Item> item)
	{
		 return shoppingService.addItemDetails(item);
	}
	
	@GetMapping(value=ShoppingConstant.GET_ITEM)
	public @ResponseBody Optional<Item> getItemById(@RequestBody Long id){
		
		return shoppingService.getItemById(id);
	}
	
	@PostMapping(value=ShoppingConstant.ADD_ITEM_TO_CART)
	public @ResponseBody List<Cart> addToCart(@RequestBody List<Cart> cart)
	{
		return shoppingService.addToCart(cart);
	}
	
	
	@PostMapping(value=ShoppingConstant.PROCESS_ITEM)
	public void processItemForCheckout(@RequestBody List<CartDto> cartdto) {
		
		shoppingService.processItemForCheckOut(cartdto);
	}


	

}
