package com.EShoapEaze.service;

import com.EShoapEaze.exception.ProductException;
import com.EShoapEaze.modal.Cart;
import com.EShoapEaze.modal.User;
import com.EShoapEaze.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
